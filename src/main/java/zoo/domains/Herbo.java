package zoo.domains;

import lombok.Getter;

@Getter
public class Herbo extends Animal {
    private final int kindness;

    public Herbo(int consumedFood, int animalKindness) {
        super(consumedFood);
        assert animalKindness <= 0;
        kindness = animalKindness;
    }
}