package FantasticBeasts.Beasts;

public abstract class LandBeast extends Beast{
    public LandBeast(String name, int age, boolean isDangerous) {
        super(name, age, TypeBeast.LAND, isDangerous);
    }
}
