package FantasticBeasts.Beasts;

import FantasticBeasts.Client;

import java.util.*;

public class Mermaid extends WaterBeast implements Dangerous{
    private String hairColor;
 //   private Set<Client> clientsKidnapped = new HashSet<>();
    public Mermaid(String name, int age, int maxDepth, String hairColor) {
        super(name, age, true, maxDepth);
        this.hairColor = hairColor;
    }

    @Override
    public boolean makeAttraction(Client client) {
        if (singSong(client)){
            System.out.println(client.getName() + " е омаян от песента на русалката " + this.getName());
            System.out.println(this.getName() + " го отвлича към дълбините");
            //clientsKidnapped.add(client);
            takeClient(client, this, "MERMAID");
            //TODO да махна клиента от парка?
            return true;
        }
        return false;
    }
    private boolean singSong(Client client) {
        System.out.println("Русалката " + this.getName() + " пее песен на " + client.getName());
        return (new Random().nextInt(1,11) == 1);
    }
}
