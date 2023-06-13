package FantasticBeasts.Beasts;

public abstract class AirBeast extends Beast {
    private int maxFlyingSpeed;
    public AirBeast(String name, int age, boolean isDangerous, int maxFlyingSpeed) {
        super(name, age, TypeBeast.AIR, isDangerous);
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    //не е нужно по условие
    void fly(){
        System.out.println("Fly with " + this.maxFlyingSpeed);
    }


}
