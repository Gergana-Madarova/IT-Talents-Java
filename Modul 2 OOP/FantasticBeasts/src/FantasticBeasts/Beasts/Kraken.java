package FantasticBeasts.Beasts;

import FantasticBeasts.Client;

public class Kraken extends WaterBeast{
    //дължина на пипалата
    private int tentacleLength;
    public Kraken(String name, int age, int maxDepth, int tentacleLength) {
        super(name, age, false, maxDepth);
        this.tentacleLength = tentacleLength;
    }

    @Override
    public boolean makeAttraction(Client client) {
        givePearl(client);
        return false;
    }
    private void givePearl(Client client){
        System.out.println("Кракен " + this.getName() + " подарява перла на " + client.getName());
    }
}
