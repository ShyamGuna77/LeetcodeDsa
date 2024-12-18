class Solution {
    public static int LargestElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {3, 5, 7, 2, 8};
        int[] arr2 = {-1, -5, -3, -4};
        int[] arr3 = {42}; // Single element
        int[] arr4 = {};   // Empty array

        try {
            System.out.println("Largest in arr1: " + LargestElement(arr1));
            System.out.println("Largest in arr2: " + LargestElement(arr2));
            System.out.println("Largest in arr3: " + LargestElement(arr3));


            System.out.println("Largest in arr4: " + LargestElement(arr4));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
