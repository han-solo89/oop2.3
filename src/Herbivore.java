
public class Herbivore extends Mammal{
    protected Herbivore(String name, int age, String livingEnvironment, int movemetSpeed, String food) {
        super(name, age, livingEnvironment, movemetSpeed, food);
    }

    @Override
    void eat() {System.out.println("eating." + getFood());}

    @Override
    void sleep() {System.out.println("they sleep on the ground.");}
    @Override
    void go() {System.out.println("they move around the earth.");}

    @Override
    public void walk() {System.out.println("walks.");}
    public void pastiche() {System.out.println("grazing");}

    @Override
    public String toString() {
        return "Herbivore{" +
                "name='" + getName() + '\'' +
                ", age=" +getAge() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", movementsSpeed=" + getMovemetSpeed() +
                ", food='" + getFood() + '\'' +
                '}';

    }
}
