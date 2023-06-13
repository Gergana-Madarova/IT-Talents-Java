package FantasticBeasts.Beasts;

import FantasticBeasts.Client;

public class Dwarf extends LandBeast{
    public Dwarf(String name, int age) {
        super(name, age, false);
    }

    @Override
    public boolean makeAttraction(Client client) {
        forgeGemRing(client);
        return false;
    }
    public void forgeGemRing(Client client){
        //това трябва ли да го направим в клиента?
        //например int поле, че е получил пръстен?
        System.out.println("Джуджето " + this.getName() + " изковава пръстен от скъпоценен камък и да го подарява на " + client.getName());
    }
}
