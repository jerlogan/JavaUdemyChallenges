package Encapsulation_Challenge;
import java.util.Scanner;

public class Printer {
    private int tonerLevel = 100;
    private int numberPagesPrinted = 0;
    private boolean duplexPrinter = true;
    private String fillTonerPrompt = "no";

    public Printer(int tonerLevel, int numberPagesPrinted, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.numberPagesPrinted = numberPagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberPagesPrinted() {
        return numberPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public void fillToner() {
        System.out.println("Refill toner? Please type yes or no.");
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        fillTonerPrompt = scanner.next();
        if (fillTonerPrompt.equalsIgnoreCase("yes"))
            this.tonerLevel = 100;
    }

    public void printPage(int numberOfPages) {
        numberPagesPrinted += numberOfPages;
        tonerLevel -= (numberOfPages * 3);
        if (tonerLevel < 0) {
            System.out.println("Sorry, your print was unsuccessful. Please fill your toner now.");
            fillToner();
        }
        else {
            System.out.println("You have successfully printed " + numberOfPages + " pages. " +
                    "You have printed " + getNumberPagesPrinted() + " pages total. \n" +
                    "Your toner level is at " + getTonerLevel() + ".");
            fillToner();
        }
    }
}
