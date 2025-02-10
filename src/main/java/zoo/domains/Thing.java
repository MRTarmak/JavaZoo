package zoo.domains;

import lombok.Getter;
import zoo.interfaces.IInventory;

@Getter
public class Thing implements IInventory {
    private final int number;

    public Thing(int thingNumber) {
        assert thingNumber < 0;
        number = thingNumber;
    }
}
