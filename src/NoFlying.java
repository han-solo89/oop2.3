
public class NoFlying extends Birds {
    protected NoFlying(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment, typeMovement);
    }
    public void walk() {System.out.println("they move on foot.");}

    @Override
    void eat() {System.out.println("they eat insects and plants.");}

    @Override
    void sleep() {System.out.println("they sleep in the nest.");}

    @Override
    void go() {System.out.println("they move on the ground.");}

    @Override
    public void hunting() {System.out.println("they hunt insects, fish.");}
    @Override
    public String toString() {
        return "Herbivore{" +
                "name='" + getName() + '\'' +
                ", age=" +getAge() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", typeArea='" + getTypeArea() + '\'' +
                '}';

    }
}
