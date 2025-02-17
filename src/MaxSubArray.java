public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int res = nums[0];  // Inicializa com o primeiro elemento do array
        int maxEnding = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Decide se continua somando ou recomeça o subarray
            maxEnding = Math.max(maxEnding + nums[i], nums[i]);

            // Atualiza o resultado máximo se necessário
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums)); // Saída esperada: 6
    }


}
