import java.util.Arrays;

public class Compress {
    public static void main(String[] args) {
        SolutionCompress solution = new SolutionCompress();

        test(solution, new char[]{'a','a','b','b','c','c','c'});
        test(solution, new char[]{'a'});
        test(solution, new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'});
        test(solution, new char[]{'a','a','a','a','a'});
        test(solution, new char[]{'a','b','c'});
    }

    private static void test(SolutionCompress solution, char[] chars) {
        System.out.println("Input : " + Arrays.toString(chars));

        int length = solution.compress(chars);

        System.out.println("Length: " + length);
        System.out.println("Output: " + Arrays.toString(Arrays.copyOf(chars, length)));
        System.out.println("----------------------------");
    }
}

class SolutionCompress {
    public int compress(char[] chars) {
        int write = 0;

        for (int read = 0; read < chars.length;) {
            char currentChar = chars[read];
            int count = 0;

            // Đếm số ký tự liên tiếp
            while (read < chars.length && chars[read] == currentChar) {
                count++;
                read++;
            }

            // Ghi ký tự
            chars[write++] = currentChar;

            // Ghi số lượng nếu > 1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}