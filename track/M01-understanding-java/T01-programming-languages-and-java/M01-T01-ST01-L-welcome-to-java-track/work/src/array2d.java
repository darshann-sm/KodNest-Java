import java.util.Arrays;

/**
 * - 2dArray
 */
public class array2d {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 56, 67, 89 },
                { 78, 9, 34 },
                { 56, 56, 78, 98, 9, 23, 54, 67, 87 }
        };

        // 1. Plain numbers with spaces (nested loop)
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("---");

        // 2. Bracketed format per row (Arrays.toString)
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}