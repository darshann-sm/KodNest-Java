public class max {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 23, 56, 23, 56, 24, 566, 88, 7768, 4325 };
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
