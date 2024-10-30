class LeadersInArray
{
	/* Java Function to print leaders in an array */
	// void printLeaders(int arr[], int size)
	// {
	// 	int max_from_right = arr[size-1];

	// 	/* Rightmost element is always leader */
	// 	System.out.print(max_from_right + " ");
	
	// 	for (int i = size-2; i >= 0; i--)
	// 	{
	// 		if (max_from_right < arr[i])
	// 		{		
	// 		max_from_right = arr[i];
	// 		System.out.print(max_from_right + " ");
	// 		}
	// 	}
	// }

    public static void printLeaderss(int arr[], int size)
	{
		int max_from_right = arr[size-1];

		/* Rightmost element is always leader */
		System.out.print(max_from_right + " ");
	
		for (int i = size-2; i >= 0; i--)
		{
			if (max_from_right < arr[i])
			{		
			max_from_right = arr[i];
			System.out.print(max_from_right + " ");
			}
		}
	}

	/* Driver program to test above functions */
	public static void main(String[] args)
	{
		// LeadersInArray lead = new LeadersInArray();
		int arr[] = new int[]{16, 17, 4, 3, 5, 2};
		int n = arr.length;
		// lead.printLeaders(arr, n);
        printLeaderss(arr, n);
	}
}

// using arrayList 
// import java.util.ArrayList;
// import java.util.Collections;

// public class LeadersInArray {

//     public static void main(String[] args) {
//         int[] arr = {16, 17, 4, 3, 5, 2}; // Sample array
//         ArrayList<Integer> leaders = findLeaders(arr);
        
//         System.out.println("Leaders in the array: " + leaders);
//     }

//     public static ArrayList<Integer> findLeaders(int[] arr) {
//         ArrayList<Integer> leaders = new ArrayList<>();
//         int n = arr.length;

//         // Start from the last element
//         int maxFromRight = arr[n - 1];
//         leaders.add(maxFromRight); // The last element is always a leader

//         // Traverse the array from second last to the first element
//         for (int i = n - 2; i >= 0; i--) {
//             if (arr[i] > maxFromRight) {
//                 maxFromRight = arr[i]; // Update maxFromRight
//                 leaders.add(arr[i]); // Add leader to the list
//             }
//         }

//         // Reverse the leaders list to maintain the order of appearance
//         Collections.reverse(leaders);
//         return leaders;
//     }
// }

