import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //Creating a Concrete class instance
       Concrete concreteInstance = new Concrete();

       //Adding data to the list
       concreteInstance.addList("Hello");
       concreteInstance.addList("How");
       concreteInstance.addList("Are");
       concreteInstance.addList("You");

       //Creating a string iterator after the data was added to the list
       Iterator<String> iteratorMain = concreteInstance.createIterator();
       
       //Looping through the iterator till the list is printed out
       while(iteratorMain.hasNext()) {
        System.out.println(iteratorMain.next());
       }
    }
}
