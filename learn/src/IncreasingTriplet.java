import java.util.Arrays;

public class IncreasingTriplet {
    public static void main(String[] args) {
        SolutionIncreasingTriplet solution = new SolutionIncreasingTriplet();

        test(solution, new int[]{1, 2, 3, 4, 5});
        test(solution, new int[]{5, 4, 3, 2, 1});
        test(solution, new int[]{2, 1, 5, 0, 4, 6});
        test(solution, new int[]{20, 100, 10, 12, 5, 13});
        test(solution, new int[]{1, 1, 1, 1});
        test(solution, new int[]{1, 5, 0, 4, 1, 3});
    }

    private static void test(SolutionIncreasingTriplet solution, int[] nums) {
        boolean result = solution.increasingTriplet(nums);

        System.out.println("Input : " + Arrays.toString(nums));
        System.out.println("Output: " + result);
        System.out.println("---------------------------");
    }
}

class SolutionIncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        int one = Integer.MAX_VALUE;
        int two = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= one) {
                one = num;
            } else if (num <= two) {
                two = num;
            } else {
                return true;
            }
        }

        return false;
    }
}