public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int q = a.length() - 1;
        int w = b.length() - 1;

        int s = 0;

        while(q >= 0 || w >= 0){

            int sum = s;

            if(q >= 0) {
                sum += (a.charAt(q--) - '0');
            }

            if(w >= 0) {
                sum += (b.charAt(w--) - '0');
            }

            result.insert(0, sum%2);

            s = (sum / 2);
        }

        if (s > 0) {
            result.insert(0, 1);
        }

        return result.toString();
    }
}