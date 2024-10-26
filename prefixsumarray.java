public class prefixsumarray {
    public static void maxsumarray(int numbers[]){
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        //Calculate prefix array 
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currsum=start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if (maxSum<currsum) {
                    maxSum=currsum;                    
                }
            }
        }
        System.out.println("maxSum ="+ maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={2,5,-1,-4,7};
        maxsumarray(numbers);
    }
    
}
// Output is maxSum =9

