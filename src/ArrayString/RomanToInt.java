package ArrayString;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<Character, Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        Integer result = 0;
        //IV
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length()-1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i+1))) {
                result -= roman.get(s.charAt(i));
            } else {
                result += roman.get(s.charAt(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }

}
