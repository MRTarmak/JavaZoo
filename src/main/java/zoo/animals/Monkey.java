package zoo.animals;

import zoo.domains.Herbo;

public class Monkey extends Herbo {
    public Monkey(int consumedBananas, int monkeyKindness) {
        super(consumedBananas, monkeyKindness);
    }

    @Override
    public void saySomething() {
        System.out.println("U-u-a-a");
    }

    @Override
    public String getKind() {
        return "Monkey";
    }
}
