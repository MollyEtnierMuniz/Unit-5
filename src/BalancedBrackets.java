import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean balancedBrackets(String string) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> bracketPairs = new HashMap<Character, Character>();
        bracketPairs.put(')', '(');
        bracketPairs.put(']', '[');
        bracketPairs.put('}', '{');
        bracketPairs.put('<', '>');

        for (int i = 0; i < string.length(); i += 1) {
            if (bracketPairs.containsValue(string.charAt(i))) {
                stack.push(string.charAt(i));
            } else if (bracketPairs.containsKey(string.charAt(i))) {
                if (stack.isEmpty()) {
                    return false;
                }
                Character mostRecentBracket = stack.pop();
                if (!mostRecentBracket.equals(bracketPairs.get(string.charAt(i)))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
