package zoo.domains;

import lombok.Getter;

@Getter
public class Herbo extends Animal {
    private final int kindness;

    public Herbo(int consumedFood, int animalKindness) {
        super(consumedFood);
        kindness = animalKindness;
    }

    public boolean isKind() {
        return kindness > 5;
    }
}