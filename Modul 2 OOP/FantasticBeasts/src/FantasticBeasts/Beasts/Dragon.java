package FantasticBeasts.Beasts;

import FantasticBeasts.Client;

import java.util.*;

public class Dragon extends AirBeast implements Dangerous{
    public Dragon(String name, int age, int maxFlyingSpeed) {
        super(name, age, true, maxFlyingSpeed);
    }

    @Override
    public boolean makeAttraction(Client client) {
        if (givesGem(client)){
            System.out.println("Но драконът" + this.getName() + " решава, че" + client.getName() + " не е „достоен“ и го изпепелява!");
            //clientsBurned.add(client);
            takeClient(client, this, "DRAGON");
            //TODO да махна клиента от парка?
            return true;
        }
        return false;
    }
    private boolean givesGem(Client client){
        System.out.println("Драконът" + this.getName() + " дава скъпоценен камък от съкровището си на " + client.getName());
        return (new Random().nextInt(1,11) == 1);
    }
}
