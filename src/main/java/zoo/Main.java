package zoo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zoo.organizations.Zoo;
import zoo.utilities.ContextConfig;
import zoo.utilities.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);
        Zoo zoo = context.getBean(Zoo.class);

        Printer printer = new Printer();

        Scanner scanner = new Scanner(System.in);

        printer.printHint();
        while(true) {
            String command = scanner.next();
            String kind, name;

            switch (command) {
                case "help":
                    printer.printHelp();
                    break;
                case "addp":
                    kind = scanner.next();
                    name = scanner.next();
                    try {
                        if (zoo.addAnimal(kind.toLowerCase(), name.toUpperCase(), 1))
                            printer.printAddaSuccess();
                        else
                            printer.printAddaFailure();
                    } catch (Exception exception) {
                        printer.printException(exception);
                    }
                    break;
                case "addh":
                    kind = scanner.next();
                    name = scanner.next();
                    int kindness = scanner.nextInt();
                    try {
                        if (zoo.addAnimal(kind.toLowerCase(), name.toUpperCase(), kindness))
                            printer.printAddaSuccess();
                        else
                            printer.printAddaFailure();
                    } catch (Exception exception) {
                        printer.printException(exception);
                    }
                    break;
                case "addi":
                    String type = scanner.next();
                    try {
                        zoo.addInventory(type.toLowerCase());
                    } catch (Exception exception) {
                        printer.printException(exception);
                    }
                    printer.printAddiSuccess();
                    break;
                case "report":
                    printer.printReport(zoo.getReport());
                    break;
                case "food":
                    printer.printReport(zoo.getFoodReport());
                    break;
                case "contact":
                    printer.printReport(zoo.getContactReport());
                    break;
                case "inventory":
                    printer.printReport(zoo.getInventoryReport());
                    break;
                case "exit":
                    return;
                default:
                    printer.printUnknownCommand();
                    break;
            }
        }
    }
}
