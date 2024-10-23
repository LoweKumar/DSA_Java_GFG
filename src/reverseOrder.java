// Java Program to Demonstrate Working of reverseOrder()
// method of Collections class
// To sort a list in descending order

// Importing required utility classes
import java.util.*;

// Main class
// Collectionsorting
public class reverseOrder {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating a list of integers for which we
        // create an empty ArrayList by
        // declaring object of ArrayList class
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Custom input integer elements
        al.add(30);
        al.add(20);
        al.add(10);
        al.add(40);
        al.add(50);

        // Using sort() method of Collections class to
        // sort the elements and passing list and using
        // reverseOrder() method to sort in descending order
        //Collections.sort(al, Collections.reverseOrder());
        Collections.sort(al);
        Collections.reverse(al);

        // Lastly printing the descending sorted list on
        // console
        System.out.println(
                "List after the use of Collection.reverseOrder()"
                        + " and Collections.sort() :\n" + al);
    }
}
