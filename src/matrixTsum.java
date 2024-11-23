import java.util.*;


public class matrixTsum {
    static int matrixTSum(int n, int[][] matrix) {
        n = matrix.length;
        int sum = 0;
        int middle = n/2;

        for(int i=0; i<n; i++)
        {
            sum += matrix[0][i];
        }
        for(int i=0; i<n; i++)
        {
            sum += matrix[i][middle];
        }
        if(n%2!=0)
        {
            sum -= matrix[middle][middle];
        }
        return sum;

    }

    public static void main(String args[]) {
        int n = 3;
    	int[][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
        assert (matrixTSum(n,matrix) == 19) : "Expect 19 for matrix = {{1,2,3},{4,5,6},{7,8,9}}";
        System.out.println("All test cases in main function passed");
    }
}