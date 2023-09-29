class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        RedPrinter redPrinter = new RedPrinter();
        BluePrinter bluePrinter = new BluePrinter();

        printer.print("Звичайний текст");
        redPrinter.print("Цей текст червоний");
        bluePrinter.print("Цей текст синій");

        // Використання приведення типів
        Printer redAsPrinter = (Printer) redPrinter;
        redAsPrinter.print("Цей текст червоний (приведення до Printer)");

        Printer blueAsPrinter = (Printer) bluePrinter;
        blueAsPrinter.print("Цей текст синій (приведення до Printer)");
    }
}