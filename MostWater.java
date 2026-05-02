package dsa;

public class MostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            
            int currentHeight = Math.min(height[left], height[right]);
            
            int currentArea = width * currentHeight;
            maxWater = Math.max(maxWater, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        MostWater sol = new MostWater();
        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum water: " + sol.maxArea(input));
    }
}
