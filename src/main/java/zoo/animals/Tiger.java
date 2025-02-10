package zoo.animals;

import zoo.domains.Predator;

public class Tiger extends Predator {
    public Tiger(int consumedMeat) {
        super(consumedMeat);
    }

    @Override
    public void saySomething() {
        System.out.println("*Growl*");
    }
}
