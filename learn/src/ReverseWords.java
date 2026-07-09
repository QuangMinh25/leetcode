public class ReverseWords {
    public static void main(String[] args) {
        SolutionReverseWords solution = new SolutionReverseWords();

        test(solution, "the sky is blue");
        test(solution, "  hello world  ");
        test(solution, "a good   example");
        test(solution, "    Bob    Loves  Alice   ");
        test(solution, "Alice does not even like bob");
    }

    private static void test(SolutionReverseWords solution, String s) {
        String result = solution.reverseWords(s);

        System.out.println("Input : \"" + s + "\"");
        System.out.println("Output: \"" + result + "\"");
        System.out.println("---------------------------");
    }
}

class SolutionReverseWords {
    public String reverseWords(String s) {
        // Tách các từ, bỏ khoảng trắng thừa
        String[] words = s.trim().split("\\s+");

        // Đảo ngược mảng từ
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}