public class MaxProduct {

    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProd = nums[0]; // Maior produto até agora
        int minProd = nums[0]; // Menor produto até agora
        int res = nums[0];     // Resultado final

        for (int i = 1; i < n; i++) {
            int num = nums[i];

            // Se o número for negativo, inverter maxProd e minProd
            if (num < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            // Atualiza maxProd e minProd
            maxProd = Math.max(num, maxProd * num);
            minProd = Math.min(num, minProd * num);

            // Atualiza o resultado máximo
            res = Math.max(res, maxProd);
        }

        return res;
    }


    public static void main(String[] args) {
        int[] nums = {1,-3,4,2};
        System.out.println(maxProduct(nums)); // Saída esperada: 6
    }

}
