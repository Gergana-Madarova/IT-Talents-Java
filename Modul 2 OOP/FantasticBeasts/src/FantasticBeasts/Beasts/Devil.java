package FantasticBeasts.Beasts;

import FantasticBeasts.Client;

import java.util.*;

public class Devil extends LandBeast implements Dangerous{
    public Devil(String name, int age) {
        super(name, age, true);
    }

    @Override
    public boolean makeAttraction(Client client) {
        if (fulfillsWish(client)){
            System.out.println("Дяволът " + this.getName() + " взима душата на " + client.getName());
             takeClient(client, this, "DEVIL");
             return true;
            //TODO да махна ли клиента от парка? Той е отвлечен и остава в парка?
        }
        return false;
    }
    private boolean fulfillsWish(Client client){
        System.out.println("Дяволът " + this.getName() + " изпълнява желание на " + client.getName());
        return (new Random().nextInt(1,11) == 1);
    }
}