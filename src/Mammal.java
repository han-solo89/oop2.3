import  static ValidateUtils.validateInteger;
import static ValidateUtils.validateString;

public abstract class Mammal extends Animal {
    private final int movemetSpeed;
    private String food;
    protected Mammal(String name, int age, String livingEnvironment, int movemetSpeed, String food) {
        super(name, age, livingEnvironment);
        this.movemetSpeed = validateInteger(movemetSpeed,1);
        this.food = validateString(food,"eats milk");
    }

    public int getMovemetSpeed() {return movemetSpeed;}
    public String getFood() {return food;}
    public void setFood(String food) {this.food = food;}

    public abstract void walk();
}
