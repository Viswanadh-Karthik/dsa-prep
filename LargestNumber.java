public class LargestNumber {

    public static int findLargestElement(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr1 = {2, 5, 1, 3, 0};
        int max1 = findLargestElement(arr1);

        System.out.println("The largest element in the array is: " + max1);

        int[] arr2 = {8, 10, 5, 7, 9};
        int max2 = findLargestElement(arr2);

        System.out.println("The largest element in the array is: " + max2);
    }
}