public class Palindrome {

    public class Solution {
        public static boolean isPalindrome(String s) {
            s = s.toLowerCase();
            int left = 0, right = s.length() - 1;

            while (left < right) {
                // Avança left até encontrar um caractere alfanumérico
                while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                    left++;
                }

                // Retrocede right até encontrar um caractere alfanumérico
                while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                    right--;
                }

                // Se os caracteres forem diferentes, não é palíndromo
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }

                // Move os ponteiros
                left++;
                right--;
            }

            return true;
        }

        public static void main(String[] args) {
            System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
            System.out.println(isPalindrome("race a car")); // false
            System.out.println(isPalindrome(" ")); // true
        }
    }

   /* public class Solution {
        public static boolean isPalindrome(String s) {
            StringBuilder filtered = new StringBuilder();

            // Filtrando apenas caracteres alfanuméricos e convertendo para minúsculas
            for (char c : s.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    filtered.append(Character.toLowerCase(c));
                }
            }

            // Comparando a string filtrada com sua versão invertida
            return filtered.toString().equals(filtered.reverse().toString());
        }

        public static void main(String[] args) {
            System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
            System.out.println(isPalindrome("race a car")); // false
            System.out.println(isPalindrome(" ")); // true
        }
    }*/




}
