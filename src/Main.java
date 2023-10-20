public class Main {
    public static void main(String[] args) {
        MyDictionary dictionary = new MyDictionary();

        dictionary.Dobavit("Сегодня было солнечтно");
        dictionary.Dobavit("Вчера было туманно");
        dictionary.Dobavit("Позавчера шел дождь");


        System.out.println(dictionary.getElement(0));
        System.out.println(dictionary.getElement(1));
        System.out.println(dictionary.getElement(2));

        System.out.println("Всего записей: " + dictionary.getSize());
    }
}
