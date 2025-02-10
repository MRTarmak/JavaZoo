package zoo.animals;

import zoo.domains.Predator;

public class Wolf extends Predator {
    public Wolf(int consumedMeat) {
        super(consumedMeat);
    }

    @Override
    public void saySomething() {
        System.out.println("*Howl*");
    }
}
