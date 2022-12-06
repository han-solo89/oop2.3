import java.util.Objects;

import static ValidateUtils.validateInteger;
import static ValidateUtils.validateString;

public abstract class Animal {
    private String name;
    private int age;
    private String livingEnvironment;

    protected Animal(String name, int age, String livingEnvironment) {
        this.name = validateString(name,"any name");
        this.age = validateInteger(age,1);
        this.livingEnvironment =livingEnvironment;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String getLivingEnvironment() {return livingEnvironment;}
    public void setLivingEnvironment(String livingEnvironment) {this.livingEnvironment = livingEnvironment;}

    abstract void eat();
    abstract void sleep();
    abstract void go();

    @Override
    public boolean equals(Object o)  {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(livingEnvironment, animal.livingEnvironment) ;
    }
    @Override
    public int hashCode() { return Objects.hash(name, age, livingEnvironment); }
}
