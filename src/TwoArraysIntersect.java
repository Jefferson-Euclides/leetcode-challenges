import java.sql.Array;
import java.util.*;

public class TwoArraysIntersect {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        // Contar a frequência dos elementos de nums1
        for (int num : nums1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Verificar elementos comuns em nums2 e decrementar a contagem
        for (int num : nums2) {
            if (freq.containsKey(num) && freq.get(num) > 0) {
                res.add(num);
                freq.put(num, freq.get(num) - 1); // Reduz a contagem
            }
        }

        // Converter List<Integer> para int[]
        return res.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1, 1, 2, 2, 2, 1}, new int[]{2, 2, 2}))); // [2, 2]
        System.out.println(Arrays.toString(intersect(new int[]{4, 4, 4, 9, 5}, new int[]{9, 4, 9, 8, 4, 4}))); // [4, 9] ou [9, 4]
    }

}
