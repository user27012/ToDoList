public class Main {
    public static void main(String[] args) {
        // Створення об'єкту класу Address та ініціалізація полів
        Addres myAddress = new Addres("12345", "Україна", "Київ", "Вулиця Київська", "42", "23");

        // Виведення інформації про адресу на екран
        System.out.println("Індекс: " + myAddress.getIndex());
        System.out.println("Країна: " + myAddress.getCountry());
        System.out.println("Місто: " + myAddress.getCity());
        System.out.println("Вулиця: " + myAddress.getStreet());
        System.out.println("Будинок: " + myAddress.getHouse());
        System.out.println("Квартира: " + myAddress.getApartment());
    }
}