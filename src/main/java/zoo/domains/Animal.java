package zoo.domains;

import lombok.Getter;
import zoo.interfaces.IAlive;

@Getter
public class Animal implements IAlive {
    private final int food;

    public Animal(int consumedFood) {
        assert consumedFood > 0;
        food = consumedFood;
    }
}