package Exo16;

public class Exo16 {

    public static boolean isSuffix(String u, String v){
        return u.endsWith(v);
    }

    public static String extractChain(String s, int start, int stop){
        String chain = "";
        if (start <= stop && start >= 0 && stop < s.length()){
            for (int i = start; i <= stop; i++) {
                chain += s.charAt(i);
            }
        }
        return chain;
    }

    public static void main(String[] args) {
        System.out.println(extractChain("Mamadou Ibn Amir Boss WONE", 12, 150));
    }
}
