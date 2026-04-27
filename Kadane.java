package dsa;

public class Kadane {
    public int maxSubArray(int[] nums) {
    int currentMax = nums[0];
    int globalMax = nums[0];

    for (int i = 1; i < nums.length; i++) {
        currentMax = Math.max(nums[i], currentMax + nums[i]);
        
        if (currentMax > globalMax) {
            globalMax = currentMax;
        }
    }
    return globalMax;
}

    public static void main(String[] args) {
        Kadane obj = new Kadane();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = obj.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}
