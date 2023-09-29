public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Plane(50.0, 30.0, 2000000.0, 900.0, 2020, 10000.0, 150);
        Vehicle vehicle2 = new Car(10.0, 20.0, 50000.0, 120.0, 2019, "Toyota");
        Vehicle vehicle3 = new Ship(5.0, 15.0, 1000000.0, 50.0, 2015, 200, "Miami");

        System.out.println("Літак:");
        vehicle1.displayInfo();
        System.out.println("\nАвтомобіль:");
        vehicle2.displayInfo();
        System.out.println("\nКорабель:");
        vehicle3.displayInfo();
    }
}