import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i] + 1, 0));
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 0)
                return entry.getKey();
        }
        return -1;
    }

    /*
        SOLUCAO COM XOR

    public static int singleNumber(int[] nums) {
        int result = 0;

        // Aplicamos XOR a todos os números do array
        for (int num : nums) {
            result ^= num; // XOR de todos os elementos
        }

        return result; // O único número restante é a resposta
    }*/

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums)); // Saída: 4
    }

    /*
    Entrada: nums = [4, 1, 2, 1, 2]
    Saída: 4
    */
}
