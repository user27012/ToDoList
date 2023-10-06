class ConverterTemperature {
    private ConverterTemperature() {
    }

    public static double convertCelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}