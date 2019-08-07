import java.util.Scanner;

/**
 * @author pawel.przesdzing
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiplay()){
            computation = new Multiplication();
        } else {
            computation = new Addition();
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Result: " + result);
    }

    private Scanner scanner = new Scanner(System.in);

    private double getArgument() {
        System.out.println("Enter argument:");
        return scanner.nextDouble();
    }

    private boolean shouldMultiplay() {
        System.out.println("Choosee 'M' for multiplication or anything else letter for addition:");
        return scanner.next().equals("M");
    }
}
