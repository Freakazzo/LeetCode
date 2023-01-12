import java.nio.charset.Charset;

public class IsPalindrome {
    public boolean isPalindrome(String s) {

        String reverse = "";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                reverse += c;
            }
        }
        reverse = reverse.toLowerCase();

        int a = 0;
        int b = reverse.length() - 1;

        while (a <= b) {
            if (reverse.charAt(a) != reverse.charAt(b)) {
                return false;
            }
            a += 1;
            b -= 1;
        }
        return true;
    }
}