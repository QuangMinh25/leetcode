public class ProductExceptSelf {
    public static void main(String[] args) {
        SolutionProductExceptSelf sol = new SolutionProductExceptSelf();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println(java.util.Arrays.toString(sol.productExceptSelf(nums1)));
        // Output: [24, 12, 8, 6]

        int[] nums2 = {-1, 1, 0, -3, 3};
        System.out.println(java.util.Arrays.toString(sol.productExceptSelf(nums2)));
        // Output: [0, 0, 9, 0, 0]
    }
}
class SolutionProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int prefix = 1;
        int suffix = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = prefix;
            prefix = prefix * nums[i];
        }
        for (int i = n-1; i >= 0; i--) {
            answer[i] = answer[i] * suffix;
            suffix = suffix * nums[i];
        }

        return answer;
    }
}
