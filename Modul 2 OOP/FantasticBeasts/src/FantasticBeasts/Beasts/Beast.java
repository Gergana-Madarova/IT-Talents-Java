package FantasticBeasts.Beasts;

import FantasticBeasts.Client;
import FantasticBeasts.Park;

import java.util.*;

public abstract class Beast {
    private String name;
    private int age;
    private TypeBeast typeBeast;
    private boolean isDangerous;

    public Beast(String name, int age, TypeBeast typeBeast, boolean isDangerous) {
        this.name = name;
        this.age = age;
        this.typeBeast = typeBeast;
        this.isDangerous = isDangerous;
    }

    public abstract boolean makeAttraction(Client client);
    public boolean isDangerous() {
        return isDangerous;
    }
    public String getName() {
        return name;
    }
    public TypeBeast getTypeBeast() {
        return typeBeast;
    }

    //TODO Мога ли по по-хубав начин да си взимам името на класа, за да намирам на звяра цената в priceList
    @Override
    public String toString() {
        return Arrays.stream(this.getClass().getName().toUpperCase().split("\\.")).toArray()[2].toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beast beast = (Beast) o;
        return age == beast.age && isDangerous == beast.isDangerous && name.equals(beast.name) && typeBeast == beast.typeBeast;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, typeBeast, isDangerous);
    }
}
