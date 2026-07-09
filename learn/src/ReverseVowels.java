public class ReverseVowels {
    public static void main(String[] args) {
        SolutionReverseVowels solution = new SolutionReverseVowels();

        test(solution, "IceCreAm");
        test(solution, "leetcode");
        test(solution, "hello");
        test(solution, "aA");
        test(solution, "programming");
        test(solution, "bcdfg");
    }

    private static void test(SolutionReverseVowels solution, String s) {
        String result = solution.reverseVowels(s);
        System.out.println("Input : " + s);
        System.out.println("Output: " + result);
        System.out.println("-----------------------");
    }
}

class SolutionReverseVowels {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            while (left < right && vowels.indexOf(arr[left]) == -1) {
                left++;
            }

            while (left < right && vowels.indexOf(arr[right]) == -1) {
                right--;
            }

            if (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);
    }
}