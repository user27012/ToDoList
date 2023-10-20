public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();


        myList.addElement(10);
        myList.addElement(20);
        myList.addElement(30);

        System.out.println("Елемент с индексом 1: " + myList.getElement(1));
        System.out.println("Общее количество индексов: " + myList.getCount());
    }
}