package FantasticBeasts;

import FantasticBeasts.Beasts.Beast;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Attraction {
    private final String name;
    private double price;
    private Queue<Client> clientsQueue = new LinkedList<>();
    private int clientGoCount = 0;
    private int clientTakenCount = 0;
    private final Beast beast;
    private boolean isExtreme;
    private double earnMoney;

    Attraction(String name, Beast beast){
        this.name = name;
        this.beast = beast;
        //как така и от това "какъв е коронният му номер"
        //те имат по един номер т.е. цената зависи от това кой е звяра или бъркам нещо?
        this.price = Park.priceList.get(beast.toString());
        if(beast.isDangerous()){
            this.isExtreme = true;
        }
    }

    public void startAttraction() {
        System.out.println("Дължината на опашката за атракция преди старта " + this.name + " e: " + clientsQueue.size());
        for (Iterator<Client> it = clientsQueue.iterator(); it.hasNext();){
            Client client = it.next();
            if (this.beast.makeAttraction(client)){
                clientTakenCount +=1;
            }
            //this.beast.makeAttraction(client);
            clientGoCount += 1;
            it.remove();
            System.out.println("Дължината на опашката за атракция " + this.name + " e: " + clientsQueue.size());
        }
    }

    public void addClientToQueue(Client client){
        if (!client.isPaid()){
            //ако преди това не си си платил и се опиташ да се наредиш на опашката
            System.out.println("Достъпът до тази атракция е отказан");
            return;
        }
        this.clientsQueue.offer(client);
    }

    public double getPrice() {
        return price;
    }
    public boolean isExtreme() {
        return isExtreme;
    }
    public Beast getBeast() {
        return beast;
    }
    public String getName() {
        return name;
    }
    public double getEarnMoney() {
        return earnMoney;
    }
    public void setEarnMoney(double earnMoney) {
        this.earnMoney = earnMoney;
    }
    public int getClientGoCount() {
        return clientGoCount;
    }
    public int getClientTakenCount() {
        return clientTakenCount;
    }

    public Queue<Client> getClientsQueue() {
        //TODO как се прави Collections.unmodifiable, когато е опашка колекцията?
        return clientsQueue;
    }
}