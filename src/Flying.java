
public class Flying extends Birds {

    protected Flying(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment, typeMovement);
    }
    @Override
    public void hunting() {System.out.println("they hunt insects, fish, and small animals.");}
    @Override
    void eat() {System.out.println("they eat insects and plants and small animals.");}
    @Override
    void sleep() {System.out.println("they sleep in the nest.");}

    @Override
    void go() {System.out.println("they fly in the sky. ");}
    public void toFly(){System.out.println("a flying bird.");}
    @Override
    public String toString() {
        return "Herbivore{" +
                "name='" + getName() + '\'' +
                ", age=" +getAge() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", typeArea='" + getTypeArea() + '\'' +
                '}' + super.toString();

    }


}
