public class Printer {
    public void print(String value) {
        System.out.println(value);
    }
}

class RedPrinter extends Printer {
    @Override
    public void print(String value) {
        System.out.println("\u001B[31m" + value + "\u001B[0m"); // Червоний колір
    }
}

class BluePrinter extends Printer {
    @Override
    public void print(String value) {
        System.out.println("\u001B[34m" + value + "\u001B[0m"); // Синій колір
    }
}