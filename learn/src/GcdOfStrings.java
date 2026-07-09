public class GcdOfStrings {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.gcdOfStrings("ABCABC", "ABC"));      // ABC
        System.out.println(solution.gcdOfStrings("ABABAB", "ABAB"));      // AB
        System.out.println(solution.gcdOfStrings("LEET", "CODE"));        // ""
        System.out.println(solution.gcdOfStrings("AAAAAA", "AAA"));       // AAA
    }
}

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Nếu nối khác nhau thì không có chuỗi chung
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Tìm gcd của độ dài
        int gcdLen = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLen);
    }

    // Hàm gcd (Euclidean algorithm)
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}