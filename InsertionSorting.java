import java.util.Arrays;
public class InsertionSorting {
    public static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1; 
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // Insert current element in its correct position
            arr[prev + 1] = curr;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr)); 
    }  
}
// Output is [1, 2, 3, 4, 5]

