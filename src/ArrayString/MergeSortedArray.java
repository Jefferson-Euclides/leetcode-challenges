package ArrayString;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;
        //nums1 = [1,2,3,0,0,0], m = 3
        //nums2 = [2,5,6], n = 3
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[pMerge--] = nums1[p1--];
            } else {
                nums1[pMerge--] = nums2[p2--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,7,0,0,0};
        int[] nums1 = {2,5,6};
        merge(nums, 3, nums1, 3); // Saída esperada: 6
    }
}
