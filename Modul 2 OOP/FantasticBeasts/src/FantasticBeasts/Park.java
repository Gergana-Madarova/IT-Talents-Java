package FantasticBeasts;

import FantasticBeasts.Beasts.Beast;
import FantasticBeasts.Beasts.Dragon;
import FantasticBeasts.Beasts.TypeBeast;

import java.util.*;

public class Park {
    private String name;
    private String address;
    //TODO може би да не е static - не е нужно да има ценови лист без парк?
    public static Map<String, Double> priceList = new HashMap<>();
    private Set<Client> clients = new HashSet<>();
    private Set<Attraction> attractions = new HashSet<>();
    public static Map<String, Map<Beast, Set<Client>>> takenClientsFromBeast = new HashMap<>();

    public Park(String name, String address) {
        this.name = name;
        this.address = address;
        priceList.put("KRAKEN", 200.0);
        priceList.put("DEVIL", 100.0);
        priceList.put("DRAGON", 60.0);
        priceList.put("DWARF", 150.0);
        priceList.put("MERMAID", 250.0);
        priceList.put("GRIFFIN", 150.0);
    }

    //не е необходимо по условие.
    public void editPriceList(Beast beast, double price) {
        priceList.put(beast.toString(), price);
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    public void addClientToPark(Client client) {
        clients.add(client);
    }

    public Set<Attraction> getAttractions() {
        return Collections.unmodifiableSet(attractions);
    }

    public void report() {
        rep1();
        rep2();
        rep3();
        rep4();
        rep5();
        rep6();
        rep7();
        rep8();
        rep9();
        rep10();
    }

    //съотношение между броя клиенти, посетили екстремна атракция и броя клиенти, които не са се завърнали оттам.
    private void rep10() {
        System.out.println("---------- REPORT 10 ----------");
        System.out.print("Процент \"риск\" : ");
        int totalClients = attractions.stream()
                .filter(a -> a.isExtreme())
                .map(e -> e.getClientGoCount())
                .reduce(0, (total, client) -> total + client);
        int totalClientsTaken = attractions.stream()
                .filter(a -> a.isExtreme())
                .map(e -> e.getClientTakenCount())
                .reduce(0, (total, client) -> total + client);

        System.out.println(((double) totalClientsTaken/totalClients)*100);
    }

    //Справка с всички типове животни, подредени по акумулираните приходи.
    private void rep9() {
        System.out.println("---------- REPORT 9 ----------");
        System.out.println("Типове животни, подредени по акумулираните приходи:");
        Map<TypeBeast, Double> typeBeastEarnMoneyMap = new HashMap<>();
        double moneyFromAirBeasts = attractions.stream()
                .filter(a -> a.getBeast().getTypeBeast().equals(TypeBeast.AIR))
                .map(a -> a.getEarnMoney())
                .reduce(0.0, (total, money) -> total + money);

        double moneyFromLandBeasts = attractions.stream()
                .filter(a -> a.getBeast().getTypeBeast().equals(TypeBeast.LAND))
                .map(a -> a.getEarnMoney())
                .reduce(0.0, (total, money) -> total + money);

        double moneyFromWaterBeasts = attractions.stream()
                .filter(a -> a.getBeast().getTypeBeast().equals(TypeBeast.WATER))
                .map(a -> a.getEarnMoney())
                .reduce(0.0, (total, money) -> total + money);

        typeBeastEarnMoneyMap.put(TypeBeast.AIR, moneyFromAirBeasts);
        typeBeastEarnMoneyMap.put(TypeBeast.WATER, moneyFromWaterBeasts);
        typeBeastEarnMoneyMap.put(TypeBeast.LAND, moneyFromLandBeasts);

        //TODO как да го напиша по-добре?
        typeBeastEarnMoneyMap.entrySet().stream()
                .sorted((o1, o2) -> (int) (o2.getValue() - o1.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
        System.out.println();
    }

    //Името на най-смъртоносния дракон
    private void rep8() {
        System.out.println("---------- REPORT 8 ----------");
        Set<Dragon> dragons = new HashSet<>();
        int currentMax = 0;
        for (Map.Entry<String, Map<Beast, Set<Client>>> e : Park.takenClientsFromBeast.entrySet()) {
            if (e.getKey().equals("DRAGON")) {
                Map<Beast, Set<Client>> beastByType = e.getValue();
                for (Map.Entry<Beast, Set<Client>> e1 : beastByType.entrySet()) {
                    if (e1.getValue().size() > currentMax) {
                        currentMax = e1.getValue().size();
                        dragons = new HashSet<>();
                        dragons.add((Dragon) e1.getKey());
                    } else if (e1.getValue().size() == currentMax) {
                        dragons.add((Dragon) e1.getKey());
                    }
                }
            }
        }
        if (dragons.isEmpty()) {
            System.out.println("Няма клиенти отвлечени от дракон");
        } else {
            if (dragons.size()==1) {
                System.out.println("Най-смъртоносният дракон е: ");
            } else {
                System.out.println("Най-смъртоносните дракони са: ");
            }
            dragons.stream().forEach(d -> System.out.println(d.getName()));
        }

        System.out.println();
    }

    //Средната възраст на всички отвлечени клиенти от русалките.
    private void rep7() {
        System.out.println("---------- REPORT 7 ----------");
        int totalAge = 0;
        int countOfClients = 0;
        for (Map.Entry<String, Map<Beast, Set<Client>>> e : Park.takenClientsFromBeast.entrySet()) {
            if (e.getKey().equals("MERMAID")) {
                Map<Beast, Set<Client>> beastByType = e.getValue();
                for (Map.Entry<Beast, Set<Client>> e1 : beastByType.entrySet()) {
                    totalAge += e1.getValue().stream()
                            .map(c -> c.getAge())
                            .reduce(0, (total, age) -> total + age);

                    countOfClients += e1.getValue().size();
                }
            }
        }
        if (countOfClients == 0) {
            System.out.println("Няма клиенти отвлечени от русалките.");
        } else {
            System.out.println("Средната възраст на всички отвлечени клиенти от русалките: ");
            System.out.println(totalAge / countOfClients);
        }

        System.out.println();
    }

    //Имената на всички пенсионери, които са били изпепелени от драконите
    private void rep6() {
        System.out.println("---------- REPORT 6 ----------");
        System.out.println("Имената на всички пенсионери, които са били изпепелени от драконите: ");
        for (Map.Entry<String, Map<Beast, Set<Client>>> e : Park.takenClientsFromBeast.entrySet()) {
            if (e.getKey().equals("DRAGON")) {
                Map<Beast, Set<Client>> beastByType = e.getValue();
                for (Map.Entry<Beast, Set<Client>> e1 : beastByType.entrySet()) {
                    e1.getValue().stream()
                            .filter(c -> c.getTypeClient().equals(Client.TypeClient.RETIRED))
                            .forEach(c -> System.out.println(c.getName()));
                }
            }
        }
        System.out.println();
    }

    //Брой души, които дяволите са взели - възрастни жени.
    private void rep5() {
        System.out.println("---------- REPORT 5 ----------");
        int count = 0;
        for (Map.Entry<String, Map<Beast, Set<Client>>> e : Park.takenClientsFromBeast.entrySet()) {
            if (e.getKey().equals("DEVIL")) {
                Map<Beast, Set<Client>> beastByType = e.getValue();
                for (Map.Entry<Beast, Set<Client>> e1 : beastByType.entrySet()) {
                    count += e1.getValue().stream()
                            .filter(c -> c.getGender().equals(Client.Gender.FEMALE))
                            .filter(c -> c.getTypeClient().equals(Client.TypeClient.ADULTS))
                            .count();
                }
            }
        }
        System.out.println("Брой възрастни жени, които дяволите са взели: " + count);
        System.out.println();
    }

    //Брой клиенти, които „не са се завърнали“ от парка (погълнати)
    private void rep4() {
        System.out.println("---------- REPORT 4 ----------");
        System.out.print("Брой клиенти, които „не са се завърнали“ от парка (погълнати): ");
        int totalTakenClient = 0;
        for (Map.Entry<String, Map<Beast, Set<Client>>> e : Park.takenClientsFromBeast.entrySet()) {
            Map<Beast, Set<Client>> beastByType = e.getValue();
            for (Map.Entry<Beast, Set<Client>> e1 : beastByType.entrySet()) {
                totalTakenClient += e1.getValue().size();
            }
        }
        //разлика между flapMap и map?
/*        takenClientsFromBeast.entrySet().stream()
                .flatMap(e -> e.getValue().entrySet().stream())
                        .flatMap(beastSetEntry -> beastSetEntry.getValue().size())  */








        System.out.println(totalTakenClient);
        System.out.println();
    }

    //Името на най-посещаваната атракция нормална
    // и на най-посещаваната екстремна атракция
    private void rep3() {
        System.out.println("---------- REPORT 3 ----------");
        //TODO как да махна Optional[] от принта и да остане само името?
        System.out.println("Името на най-посещаваната нормална атракция е: " +
                attractions.stream()
                        .filter(a -> a.isExtreme() == false)
                        .sorted((o1, o2) -> Integer.compare(o1.getClientsQueue().size(), o2.getClientsQueue().size()))
                        .map(a -> a.getName())
                        .findFirst().orElse(null));
        System.out.println("Името на най-посещаваната екстремна атракция е: " +
                attractions.stream()
                        .filter(a -> a.isExtreme())
                        .sorted((o1, o2) -> Integer.compare(o1.getClientsQueue().size(), o2.getClientsQueue().size()))
                        .map(a -> a.getName())
                        .findFirst().orElse(null));
        System.out.println();
    }

    //Общ брой приходи от атракции
    private void rep2() {
        System.out.println("---------- REPORT 2 ----------");
        System.out.print("Общ брой приходи от атракции: ");
        System.out.println(attractions.stream()
                .map(m -> m.getEarnMoney())
                .reduce(0.0, (total, money) -> total + money));
        System.out.println();
    }

    //Брой деца, посетили парка
    private void rep1() {
        System.out.println("---------- REPORT 1 ----------");
        System.out.println("Брой деца, които са посетили парка: " +
                clients.stream()
                        .filter(c -> c.getTypeClient().equals(Client.TypeClient.CHILDREN))
                        .count());
        System.out.println();
    }
}
