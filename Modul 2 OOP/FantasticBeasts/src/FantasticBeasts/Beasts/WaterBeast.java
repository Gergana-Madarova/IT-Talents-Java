package FantasticBeasts.Beasts;

public abstract class WaterBeast extends Beast {
    private int maxDepth;
    public WaterBeast(String name, int age, boolean isDangerous, int maxDepth) {
        super(name, age, TypeBeast.WATER, isDangerous);
        this.maxDepth = maxDepth;
    }
}
