// Immutable class example
final class Immutable
{
    private final int value;//cant be modified
    public Immutable(int value) //cons
    {
        this.value = value;
    }
    public int getValue() 
    {
        return this.value;
    }
}

// Mutable class example
class Mutable
{
    private int value;
    public Mutable(int value) 
    {
        this.value = value;
    }
    public int getValue() 
    {
        return this.value;
    }
    public void setValue(int value) //modified
    {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) 
    {
        // Immutable object example
        Immutable i = new Immutable(10);
        System.out.println("Immutable object value: " + i.getValue());
        // Attempting to modify an immutable object's state will result in a compilation error
        // i.setValue(20);

        // Mutable object example
        Mutable m = new Mutable(10);
        System.out.println("Mutable object value: " + m.getValue());
        m.setValue(20);
        System.out.println("Mutable object value after modification: " + m.getValue());
    }
}
