package problems.java;

import java.util.Arrays;

public class MergeSortedArray88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] res = new int[n+m];

        for (int i = 0; i < nums1.length && i < m; i++) {
            res[i] = nums1[i];
        }

        for (int j = 0; j < nums2.length && j < n; j++) {
            res[m+j] = nums2[j];
        }

        nums1 = Arrays.stream(res).sorted().toArray();

        System.out.println(Arrays.toString(nums1));
    }

    public void mergePass(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }

    public static void test(){

        int[] nums1 = new int[] {1,2,3,0,0,0};
        int[] nums2 = new int[] {2,5,6};
        int m = 3;
        int n = 3;

        MergeSortedArray88 mergeSortedArray88 = new MergeSortedArray88();

        mergeSortedArray88.merge(nums1, m, nums2, n);

    }
}
