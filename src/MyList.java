import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List<Integer> data;

    public MyList() {
        data = new ArrayList<>();
    }

    public void addElement(int value) {
        data.add(value);
    }

    public int getElement(int index) {
        if (index >= 0 && index < data.size()) {
            return data.get(index);
        } else {
            throw new IndexOutOfBoundsException("Такого индекса нет");
        }
    }

    public int getCount() {
        return data.size();
    }

    public static void main(String[] args) {
        MyList myList = new MyList();

        myList.addElement(10);
        myList.addElement(20);
        myList.addElement(30);

        System.out.println("Елемент с индексом 1: " + myList.getElement(1));
        System.out.println("Общее количество индексов: " + myList.getCount());
    }
}