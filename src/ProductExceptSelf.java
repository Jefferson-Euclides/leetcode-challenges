public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Passo 1: Preencher resultado com produtos da esquerda
        result[0] = 1; // O primeiro elemento não tem nada à esquerda
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Passo 2: Multiplicar pelos produtos da direita
        int rightProduct = 1; // Começa com 1 porque não há nada à direita do último elemento
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i]; // Atualiza o produto acumulado da direita
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);

        // Imprimir resultado
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Saída esperada: 24 12 8 6
    }

    /*Entrada: nums = [1, 2, 3, 4]
    Saída: [24, 12, 8, 6]*/

}
