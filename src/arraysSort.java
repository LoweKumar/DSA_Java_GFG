
import java.util.Arrays;
import java.util.*;
public class arraysSort {

    public static void main(String[] args){
        //int a[] = {10,5,20,11,6};
        Integer a[] = {10,5,20,11,6};
        System.out.println("Arrays before sorting");
        for (int a1 : a){
            System.out.print(a1 + " ");
        }

        System.out.println();
        System.out.println("Arrays after reverse()");
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        System.out.println("Arrays after sorting");
        for (int a1 : a){
            System.out.print(a1 + " ");
        }




    }
}
