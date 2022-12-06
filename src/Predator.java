public class Predator extends Mammal{
    public Predator(String name, int age, String livingEnvironment, int movemetSpeed, String food) {
        super(name, age, livingEnvironment, movemetSpeed, food);
    }

    @Override
    void eat() {System.out.println("eating." + getFood());}

    @Override
    void sleep() {System.out.println("they sleep in the den.");}

    @Override
    void go() {System.out.println("they move very fast.");}

    @Override
    public void walk() {System.out.println("they walk wherever they want.");}
    public void hunting() {System.out.println("they hunt and kill");}

    @Override
    public String toString() {
        return "Predator{" +
                "name='" + getName() + '\'' +
                ", age=" +getAge() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", movementsSpeed=" + getMovemetSpeed() +
                ", food='" + getFood() + '\'' +
                '}';

    }
}
