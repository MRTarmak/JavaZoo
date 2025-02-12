package zoo.domains;

import lombok.Getter;
import zoo.interfaces.IAlive;

@Getter
public class Animal implements IAlive {
    private final int food;

    public Animal(int consumedFood) {
        food = consumedFood;
    }

    @Override
    public void saySomething() {
        System.out.println("What am I?..");
    }

    @Override
    public String getKind() {
        return "Unknown animal";
    }
}