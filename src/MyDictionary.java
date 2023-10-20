import java.util.ArrayList;
import java.util.List;

public class MyDictionary {

    private List<String> Dela;

    public MyDictionary(){
        Dela = new ArrayList<>();
    }

    public void Dobavit(String input){
        Dela.add(input);
    }

    public String getElement(int index) {
        if (index >= 0 && index < Dela.size()) {
            return Dela.get(index);
        } else {
            throw new IndexOutOfBoundsException("Индекса не наблюдается");
        }
    }

    public int getSize(){
        return Dela.size();
    }
}

