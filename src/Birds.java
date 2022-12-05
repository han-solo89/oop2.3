
import static ValidateUtils.validateString;

public abstract class Birds extends Animal{
    public final String typeArea;
    protected Birds(String name, int age, String livingEnvironment,  String typeMovement) {
        super(name, age, livingEnvironment);
        this.typeArea = validateString(typeMovement, "the whole world");
    }
    public String getTypeArea() { return  typeArea; }

    abstract public void hunting();
}
