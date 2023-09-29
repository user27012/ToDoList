import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Добро пожаловать! Я пощитаю ваши кружочки, пожалуйста укажите радиус ниже:");
        double radius = scan.nextDouble();
        System.out.println(myArea.areaOfCircle(radius));

    }
}