package zoo.interfaces;

public interface IAlive {
    default void saySomething() {
        System.out.println("What am I?..");
    }
}