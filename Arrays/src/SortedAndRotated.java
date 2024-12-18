
public class SortedAndRotated {
    public static boolean check(int nums[]) {
        int counter = 0; // Count the number of decreases
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Check if the current element is greater than the next element (wrap around using modulo)
            if (nums[i] > nums[(i + 1) % n]) {
                counter++;
            }
            // If there is more than one decrease, it's not sorted and rotated
            if (counter > 1) {
                return false;
            }
        }

        // If we reach here, the array is sorted and rotated
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {3, 4, 5, 1, 2}; // Expected: true
        int[] nums2 = {2, 1, 3, 4};    // Expected: false
        int[] nums3 = {1, 2, 3};       // Expected: true
        int[] nums4 = {1};             // Expected: true
        int[] nums5 = {2, 2, 2, 2};    // Expected: true

        System.out.println("Test case 1: " + check(nums1)); // Output: true
        System.out.println("Test case 2: " + check(nums2)); // Output: false
        System.out.println("Test case 3: " + check(nums3)); // Output: true
        System.out.println("Test case 4: " + check(nums4)); // Output: true
        System.out.println("Test case 5: " + check(nums5)); // Output: true
    }
}

