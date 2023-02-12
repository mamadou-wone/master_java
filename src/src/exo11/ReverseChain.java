package exo11;

public class ReverseChain {

    private ReverseChain(){
        throw new IllegalStateException("Utility class.");
    }

    public static String reverseChain(String s){
        StringBuilder reverse = new StringBuilder();
        for (int i = s.length() - 1; i >= 0 ; i--) {
            reverse.append(s.charAt(i));
        }
        return reverse.toString();
    }

}

