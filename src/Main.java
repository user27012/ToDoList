public class Main {
    public static void main(String[] args) {
        CarOverload BMW = new CarOverload(1999, 190.9, 500, "White");
        CarOverload lambo = new CarOverload(2017, 280.8, 439);
        CarOverload Gryzovik = new CarOverload(1932, 88);
        CarOverload Ferrari = new CarOverload(2022);
        System.out.println("Основные характеристики машины BMW: Год: " + BMW.rik + " Скорость: " + BMW.speed + " Вес в кг: " + BMW.vaga + " Цвет: " + BMW.colour);
        System.out.println("Основные характеристики машины lamborgini: Год: " + lambo.rik + " Скорость: " + lambo.speed + " Вес в кг: " + lambo.vaga);
        System.out.println("Основные характристики грузовика: Год: " + Gryzovik.rik + " Скорость " + Gryzovik.speed);
        System.out.println("Год выпуска феррари: " + Ferrari.rik);
    }
}