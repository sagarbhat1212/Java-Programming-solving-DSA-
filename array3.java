public class array3 {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // comparison
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 5, 9, 4, 5, 10};
        int key = 9;
        System.out.println(binarySearch(numbers, key));
    }
}

// Output is  ' 2 '

