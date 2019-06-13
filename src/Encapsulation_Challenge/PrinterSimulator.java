package Encapsulation_Challenge;

public class PrinterSimulator {
    public static void main(String[] args) {
        Printer ourPrinter = new Printer(100, 0, true);
        ourPrinter.printPage(4);
        ourPrinter.printPage(12);
        ourPrinter.printPage(30);

    }
}
