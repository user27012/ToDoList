class Vehicle {
    private double coordinatesX;
    private double coordinatesY;
    private double price;
    private double speed;
    private int year;

    public Vehicle(double coordinatesX, double coordinatesY, double price, double speed, int year) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Координати: (" + coordinatesX + ", " + coordinatesY + ")");
        System.out.println("Ціна: " + price + " грн");
        System.out.println("Швидкість: " + speed + " км/год");
        System.out.println("Рік випуску: " + year);
    }
}

class Plane extends Vehicle {
    private double altitude;
    private int passengers;

    public Plane(double coordinatesX, double coordinatesY, double price, double speed, int year, double altitude, int passengers) {
        super(coordinatesX, coordinatesY, price, speed, year);
        this.altitude = altitude;
        this.passengers = passengers;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Висота: " + altitude + " м");
        System.out.println("Кількість пасажирів: " + passengers);
    }
}

class Car extends Vehicle {
    private String brand;

    public Car(double coordinatesX, double coordinatesY, double price, double speed, int year, String brand) {
        super(coordinatesX, coordinatesY, price, speed, year);
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Марка: " + brand);
    }
}

class Ship extends Vehicle {
    private int passengers;
    private String port;

    public Ship(double coordinatesX, double coordinatesY, double price, double speed, int year, int passengers, String port) {
        super(coordinatesX, coordinatesY, price, speed, year);
        this.passengers = passengers;
        this.port = port;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Кількість пасажирів: " + passengers);
        System.out.println("Порт приписки: " + port);
    }
}