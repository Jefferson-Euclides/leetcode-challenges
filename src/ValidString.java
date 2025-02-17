import java.util.Stack;

public class ValidString {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Percorre a string
        for (char c : s.toCharArray()) {
            // Se for um parêntese de abertura, adicionamos à pilha
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // Se for de fechamento, verificamos se corresponde ao topo da pilha
            else {
                if (stack.isEmpty()) return false; // Não há abertura correspondente

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // A pilha deve estar vazia no final para ser válida
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        //System.out.println(isValid("()"));       // true
        //System.out.println(isValid("()[]{}"));   // true
        //System.out.println(isValid("(]"));       // false
        System.out.println(isValid("([)]"));     // false
        //System.out.println(isValid("{[]}"));     // true
    }
}
