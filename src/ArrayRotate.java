import java.util.Arrays;

public class ArrayRotate {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Se k >= n, reduz para evitar rotações desnecessárias

        // Inverter todo o array
        reverse(nums, 0, n - 1);
        // Inverter os primeiros k elementos
        reverse(nums, 0, k - 1);
        // Inverter os elementos restantes
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums1, 3);
        System.out.println(Arrays.toString(nums1)); // [5, 6, 7, 1, 2, 3, 4]

        int[] nums2 = {-1, -100, 3, 99};
        rotate(nums2, 2);
        System.out.println(Arrays.toString(nums2)); // [3, 99, -1, -100]
    }

}
