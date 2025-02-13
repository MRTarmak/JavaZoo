package zoo.utilities;

public class Printer {
    public void printHint() {
        System.out.println("Enter help to see a list of all available commands.");
    }

    public void printHelp() {
        System.out.println("addp [kind] [name] - adds a new predator to the zoo, enter the kind of an " +
                "animal and its name");
        System.out.println("addh [kind] [name] [kindness] - adds a new herbivore to the zoo, enter the kind of an " +
                "animal, its name and its kindness");
        System.out.println("addi [type] - adds a new thing to the zoo, enter the type of a thing");
        System.out.println("report - prints information about the number of animals in the zoo");
        System.out.println("food - prints information about the amount of food needed for animals");
        System.out.println("contact - prints a list of kind (contact) animals in the zoo");
        System.out.println("inventory - prints a list of all things and animals in the zoo");
        System.out.println("exit - closes the program");
    }

    public void printAddaSuccess() {
        System.out.println("The animal was successfully accepted");
    }

    public void printAddaFailure() {
        System.out.println("The animal was sick so it was not accepted");
    }

    public void printAddiSuccess() {
        System.out.println("The thing was successfully accepted");
    }

    public void printException(Exception exception) {
        System.out.println(exception.getMessage());
    }

    public void printReport(String report) {
        System.out.println(report);
        System.out.println("Please try again");
    }

    public void printUnknownCommand() {
        System.out.println("Unknown command, please try again");
    }
}
