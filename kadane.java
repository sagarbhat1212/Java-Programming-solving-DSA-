public class kadane {
    public static void kadanealgo(int numbers[]) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if (cs<0) {
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("Curr max subarray sum is : "+ms);
        
    }
    public static void main(String[] args) {
        int numbers[]={3,5,-4,9};
        kadanealgo(numbers);
    }
}
//Output is ' Curr max subarray sum is : 13 '

