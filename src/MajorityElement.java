import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        for (int curr : nums) {
            int count = 0;
            for (int val : nums) {
                if (curr == val) {
                    count += 1;
                }
            }
            if (count > n / 2) {
                return curr;
            }
        }
        return -1;
    }
}
