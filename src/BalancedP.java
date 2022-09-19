public class BalancedP {
    public static boolean balancedP(String string){
        int OpenParens = 0;
        for (int i=0; i < string.length(); i++){
            if (string.charAt(i) == '(') {
                OpenParens += 1;
            }
            else if (string.charAt(i) == ')'){
                OpenParens -= 1;
            }
            if (OpenParens<0) {
                return false;
            }
        }
        return OpenParens == 0;
    }
}
