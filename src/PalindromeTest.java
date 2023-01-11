public class PalindromeTest {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int reversed = 0;
        int remainder;
        int original = x;
        System.out.println(original);
        while (x != 0) {
            remainder = x % 10;
            reversed = reversed * 10 + remainder;
            x /= 10;
            if (x == 0)
                break;
            System.out.print(x);
        }
        return original == reversed;

    }
}