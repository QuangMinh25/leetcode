import java.util.Arrays;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        SolutionCanPlaceFlowers solution = new SolutionCanPlaceFlowers();

        test(solution, new int[]{1, 0, 0, 0, 1}, 1);
        test(solution, new int[]{1, 0, 0, 0, 1}, 2);
        test(solution, new int[]{0}, 1);
        test(solution, new int[]{1}, 1);
        test(solution, new int[]{0, 0}, 2);
        test(solution, new int[]{0, 0, 1, 0, 0}, 2);
    }

    private static void test(SolutionCanPlaceFlowers solution, int[] flowerbed, int n) {
        boolean result = solution.canPlaceFlowers(flowerbed.clone(), n);
        System.out.println(
                "flowerbed = " + Arrays.toString(flowerbed)
                        + ", n = " + n
                        + " -> " + result
        );
    }
}

class SolutionCanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int prev;
        int next;

        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0) {
                prev = 0;
            } else {
                prev = flowerbed[i - 1];
            }

            if (i == flowerbed.length - 1) {
                next = 0;
            } else {
                next = flowerbed[i + 1];
            }

            if (flowerbed[i] == 0 && prev == 0 && next == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }

        return n <= 0;
    }
}