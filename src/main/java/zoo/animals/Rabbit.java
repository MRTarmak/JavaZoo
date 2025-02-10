package zoo.animals;

import zoo.domains.Herbo;

public class Rabbit extends Herbo {
    public Rabbit(int consumedFood, int rabbitKindness) {
        super(consumedFood, rabbitKindness);
    }

    @Override
    public void saySomething() {
        System.out.println("*Purring*");
    }
}
