package FantasticBeasts;

import FantasticBeasts.Beasts.*;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Park park = new Park("Krasi`s Fantastic Beasts", "Sofia");

        for (int i = 0; i < 3; i++) {
            Beast kraken = new Kraken(getRandomName(), new Random().nextInt(3, 90), 40, 3);
            Beast griffin = new Griffin(getRandomName(), new Random().nextInt(3, 90), 40, 3, "red");
            Beast dwarf = new Dwarf(getRandomName(), new Random().nextInt(3, 90));
            //Създават се по три нормални атракции с Кракен, Грифон и Джудже.
            Attraction withKraken = new Attraction("withKraken" + i, kraken);
            Attraction withGriffin = new Attraction("withGriffin" + i, griffin);
            Attraction withDwarf = new Attraction("withDwarf" + i, dwarf);
            //с метод ли е по добре да ги добавям?
            //иначе от вън ще могат да ми изтрият колекцията
            //a, ако я направя с get Collections.unmodifiableSet(attractions) - няма да мога да добавям
            park.addAttraction(withDwarf);
            park.addAttraction(withKraken);
            park.addAttraction(withGriffin);
        }

        for (int i = 0; i < 2; i++) {
            Beast mermaid = new Mermaid(getRandomName(), new Random().nextInt(3, 90), 40, "orange");
            Beast dragon = new Dragon(getRandomName(), new Random().nextInt(3, 90), 50);
            Beast devil = new Devil(getRandomName(), new Random().nextInt(3, 90));
            //две екстремни атракции с Русалка, Дракон и Дявол
            Attraction withMermaid = new Attraction("withMermaid" + i, mermaid);
            Attraction withDragon = new Attraction("withDragon" + i, dragon);
            Attraction withDevil = new Attraction("withDevil" + i, devil);
            park.addAttraction(withMermaid);
            park.addAttraction(withDragon);
            park.addAttraction(withDevil);
        }

        //100 клиента на произволен принцип – деца, възрастни или пенсионери
        for (int i = 0; i < 100; i++) {
            Client client = getRandomClient();
            park.addClientToPark(client);;
            for (int j = 0; j < 2; j++) {
                while (true) {
                    //Всеки клиент си плаща и се реди на опашката, но по този начин клиента е едновременно на две опашки?
                    //ако не може да посети атракцията, си избира друга атракция
                    Attraction attraction = takeRandomAttraction(park);
                    if (client.visitAttraction(attraction)) {
                        System.out.println(client.getName() + ", на " + client.getAge() + " избра атракция - " + attraction.getName());
                        break;
                    }
                }
            }
        }

        //Всяка атракция „стартира“, като за всеки клиент от наредилите се, се изпълнява коронният номер на звяра в нея.
        for (Attraction attraction : park.getAttractions()) {
            attraction.startAttraction();
        }

        //Разпечатване на клиентите, които са отвлечени от животни
        for (Map.Entry<String, Map<Beast, Set<Client>>> e : Park.takenClientsFromBeast.entrySet()) {
            String type = e.getKey();
            System.out.println(type+":");
            Map<Beast, Set<Client>> beastByType = e.getValue();
            for(Map.Entry<Beast, Set<Client>> e1 : beastByType.entrySet()){
                String kind = e1.getKey().toString();
                System.out.println("\t" + e1.getKey().getName() + ":");
                for (Client client1 : e1.getValue()) {
                    System.out.println("\t\t" + client1);
                }
            }
        }

        //Изваждат се статистики за работата на увеселителният парк.
        park.report();
    }

    public static String getRandomFemaleName() {
        final String[] names = {"Ani", "Dani", "Maria", "Viktoria", "Geri"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }
    public static String getRandomMaleName() {
        final String[] names = {"Bobi", "Krasi", "Alex", "Mateo", "Georgi", "Ivan"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }
    public static String getRandomName() {
        final String[] names = {"Bobi", "Ani", "Dani", "Krasi", "Maria", "Viktoria", "Geri", "Alex", "Mateo", "Georgi", "Ivan"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    public static Client getRandomClient(){
        Client.Gender gender = new Random().nextBoolean() ? Client.Gender.FEMALE : Client.Gender.MALE;
        String name = (gender == Client.Gender.FEMALE) ? getRandomFemaleName() : getRandomMaleName();
        return new Client(name, new Random().nextInt(3, 90), gender);
    }

    //как по друг начин мога да го направя по-добре?
    private static Attraction takeRandomAttraction(Park park) {
        int random = new Random().nextInt(0, park.getAttractions().size());
        for (Iterator<Attraction> it = park.getAttractions().iterator(); it.hasNext(); ) {
            for (int i = 0; i < random - 1; i++) {
                it.next();
            }
            return it.next();
        }
        return null;
    }
}