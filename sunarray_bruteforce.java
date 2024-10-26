public class sunarray_bruteforce {
    public static void maxsumarray(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<numbers.length;k++){
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if (maxSum<currSum) {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum="+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={4,-1,-3,9};
        maxsumarray(numbers);
    }
}
// Output is " max sum=9 " 

