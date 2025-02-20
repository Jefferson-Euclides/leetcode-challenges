package ArrayString;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0){
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,-3,4,2};
        System.out.println(removeElement(nums, -3)); // Saída esperada: 6
    }
}
