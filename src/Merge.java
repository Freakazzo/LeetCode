import java.util.Arrays;

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int q = 0;
        if (nums2.length == 0) {
            return;
        }
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[q];
            q++;
        }
        Arrays.sort(nums1);
    }
}
//    int i = m - 1;
//    int j = n - 1;
//    int k = m + n - 1;
//
//        while(k >=0){
//        if (i >= 0 && j >= 0) {
//            if (nums1[i] >= nums2[j]) {
//                nums1[k--] = nums1[i--];
//            } else {
//                nums1[k--] = nums2[j--];
//            }
//        } else if (j >= 0) {
//            nums1[k--] = nums2[j--];
//        } else {
//            break;
//        }
//    }
//}

