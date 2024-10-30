import java.util.Arrays;
public class CountingSorting {
    public static void CountingArray(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        int count[]=new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // Sorting 
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,5,3,5,8,9};
        CountingArray(arr);
        System.out.println(Arrays.toString(arr));
    }    
}
// Output is [1, 1, 3, 5, 5, 8, 9]

