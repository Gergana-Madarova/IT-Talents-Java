package FantasticBeasts.Beasts;

import FantasticBeasts.Client;
import FantasticBeasts.Park;

import java.util.HashMap;
import java.util.HashSet;

public interface Dangerous {
    default void takeClient(Client client, Beast beast, String key){
        if (!Park.takenClientsFromBeast.containsKey(key)){
            Park.takenClientsFromBeast.put(key, new HashMap<>());
        }
        if (!Park.takenClientsFromBeast.get(key).containsKey(beast)){
            Park.takenClientsFromBeast.get(key).put(beast, new HashSet<>());
        }
        Park.takenClientsFromBeast.get(key).get(beast).add(client);
    }
}
