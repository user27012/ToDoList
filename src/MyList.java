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
            throw new IndexOutOfBoundsException("Индекса не наблюдается");
        }
    }

    public int getCount() {
        return data.size();
    }
}