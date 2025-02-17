import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calcula o valor complementar para o elemento atual

            if (complements.containsKey(complement)) {
                return new int[] {complements.get(complement), i}; // Corrigido
            }

            complements.put(nums[i], i); // Armazena o número atual e seu índice
        }

        return new int[] {}; // Retorna um array vazio caso não encontre (não esperado)
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result)); // Saída esperada: [0, 1]
    }

}
