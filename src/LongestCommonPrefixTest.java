public class LongestCommonPrefixTest {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        if (strs == null || strs.length == 0) {
            return sb.toString();
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int minimumLength = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            minimumLength = Math.min(minimumLength, strs[i].length());
        }
        for (int i = 0; i < minimumLength; i++) {
            char current = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != current) {
                    return sb.toString();
                }
            }
            sb.append(current);
        }
        return sb.toString();
    }
}
