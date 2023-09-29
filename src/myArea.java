public class myArea {
    public static final double PI = 3.14;

    public static double areaOfCircle(double radius) {
        double area = PI * radius * radius;
        System.out.println("Площа кола з радіусом " + radius + " дорівнює:");
        return area;
    }
}
