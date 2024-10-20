public class largestInteger {
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;   // for -infinity 
        for(int i=0;i<numbers.length;i++){
            if (largest<numbers[i]) {
                largest=numbers[i];   
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[]={1,4,5,7,4,10};
        System.out.println(getlargest(numbers));
    }
}
// Output is " 10 "  

