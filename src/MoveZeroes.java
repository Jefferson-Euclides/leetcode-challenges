public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Move todos os números diferentes de zero para frente
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Preenche o restante do array com zeros
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);

        // Imprimir resultado
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Saída esperada: 1 3 12 0 0
    }

}
