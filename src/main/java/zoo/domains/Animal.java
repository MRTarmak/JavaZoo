package zoo.domains;

import lombok.Getter;
import zoo.interfaces.IAlive;

@Getter
public class Animal implements IAlive {
    private final int food;

    public Animal(int consumedFood) {
        food = consumedFood;
    }
}