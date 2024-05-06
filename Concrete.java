import java.util.ArrayList;
import java.util.Iterator;

public class Concrete implements Aggregate {
    //Creating the array list
    ArrayList<String> ourList = new ArrayList();
    
    //Creating our iterator and returning the list iterator
    public Iterator<String> createIterator() {
        return ourList.iterator();
    }

    //Add data to list method
    public void addList(String add) {
        ourList.add(add);
    }
}
