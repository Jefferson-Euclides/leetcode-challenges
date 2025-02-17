public class FirstStringIndex {

    /*
    Entrada: haystack = "hello", needle = "ll"
    Saída: 2
    */

    /*
    Entrada: haystack = "aaaaa", needle = "bba"
    Saída: -1
    */

    public static int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        if (nLen == 0) return 0; // Se needle é vazio, retorna 0

        for (int i = 0; i <= hLen - nLen; i++) {
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }

        return -1; // Needle não encontrado
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll")); // Saída: 2
        System.out.println(strStr("aaaaa", "bba")); // Saída: -1
        System.out.println(strStr("", "")); // Saída: 0
    }

}
