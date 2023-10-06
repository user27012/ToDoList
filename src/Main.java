public class Main {
    public static void main(String[] args) {
        double celsius = 25.0;

        double kelvin = ConverterTemperature.convertCelsiusToKelvin(celsius);
        double fahrenheit = ConverterTemperature.convertCelsiusToFahrenheit(celsius);

        System.out.println(celsius + " Градусов Цельсия = " + kelvin + " Кельвинов");
        System.out.println(celsius + " Градусов Целсия = " + fahrenheit + " Фаренгейт");
    }
}
