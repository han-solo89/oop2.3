
public final class Amphibians extends Animal {
    protected Amphibians(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    @Override
    void eat() {System.out.println("they eat insects");}

    @Override
    void sleep() {System.out.println(".they sleep in the water");}

    @Override
    void go() {System.out.println("they move on water and on land");}

    public void hunting() {System.out.println("they hunt insects");}
}
