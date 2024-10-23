import java.util.Arrays;

public class ArrayInsertion {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToAdd = 99;
        int position = 2; // Position where the element should be inserted

        // Check if the position is valid
        if (position < 0 || position > array.length) {
            System.out.println("Position is out of bounds.");
            return;
        }

        // Insert the element at the specified position
        insertElement(array, elementToAdd, position);
        

        // Output the modified array
        System.out.println("Modified Array: " + Arrays.toString(array));
    }

    public static void insertElement(int[] array, int element, int position) {
        // Shift elements to the right to create space for the new element
        for (int i = array.length - 1; i > position; i--) {
            array[i] = array[i - 1];
        }

        // Insert the new element
        array[position] = element;
    }
}
