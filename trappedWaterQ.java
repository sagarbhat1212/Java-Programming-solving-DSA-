public class trappedWaterQ {
    public static int trappedRainWater(int height[]){
        int n = height.length;
        // Calculate left max boundary - array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // Calculate right max boundary - array
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        int trappedWater = 0;
        // Calculate trapped water
        for(int i = 0; i < n; i++){
            // Water level = min(leftmax bound, rightmax bound)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            // Trapped water = waterlevel - height[i]
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("TrappedRainWater: " + trappedRainWater(height));        
    }   
}

