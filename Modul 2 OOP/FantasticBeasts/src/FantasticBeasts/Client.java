package FantasticBeasts;

public class Client {
    public enum Gender {FEMALE, MALE}
    public enum TypeClient {CHILDREN, ADULTS, RETIRED}
    private String name;
    private int age;
    private Gender gender;
    private TypeClient typeClient;
    private boolean isPaid = false;

    public Client(String name, int age, Gender gender) {
        //TODO validate name, age
        this.name = name;
        this.age = age;
        this.gender = gender;
        if (age <= 18) {
            this.typeClient = TypeClient.CHILDREN;
        }
        else if (age > 65) {
            this.typeClient = TypeClient.RETIRED;
        }
        else {
            this.typeClient = TypeClient.ADULTS;
        }
    }

    public boolean visitAttraction(Attraction attraction){
        if (this.typeClient == TypeClient.CHILDREN && attraction.isExtreme()) {
            System.out.println("Деца не могат да посетят атракцията " + attraction.getName());
            this.isPaid = false;
            return false;
        }
        attraction.setEarnMoney(attraction.getEarnMoney() + payTicket(attraction));
        this.isPaid = true;
        attraction.addClientToQueue(this);
        return true;
    }
    private double payTicket(Attraction attraction){
        if (typeClient == TypeClient.CHILDREN){
            return attraction.getPrice()/2;
        } else if (typeClient == TypeClient.RETIRED) {
            return (attraction.getPrice() - ((attraction.getPrice()*20)/100));
        }
        return attraction.getPrice();
    }

    public TypeClient getTypeClient() {
        return typeClient;
    }
    public boolean isPaid() {
        return isPaid;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return this.name + " на " + this.age;
    }
}
