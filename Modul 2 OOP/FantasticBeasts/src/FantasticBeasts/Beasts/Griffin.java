package FantasticBeasts.Beasts;

import FantasticBeasts.Client;

import java.util.Arrays;

public class Griffin extends AirBeast {
    //размах на крилете и цвят на гривата
    private int wingspan;
    private String colorMane;

    public Griffin(String name, int age, int maxFlyingSpeed, int wingspan, String colorMane) {
        super(name, age, false, maxFlyingSpeed);
        this.wingspan = wingspan;
        this.colorMane = colorMane;
    }
    @Override
    public boolean makeAttraction(Client client) {
        rideMe(client);
        return false;
    }
    private void rideMe(Client client){
        System.out.println("Грифон " + this.getName() + " дава на " + client.getName() + " да го поязди.");
    }
}
