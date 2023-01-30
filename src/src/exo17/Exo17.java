package exo17;

import exo14.FindChain;

public class Exo17 {

    public static void main(String[] args) {
        convertToUpper("Mamadou ibn Amir Boss WONE", 's');
    }

    public static void convertToUpper(String chain, char c){
        String newWord = "";
        char val = 0;
        for (int i = 0; i < chain.length(); i++) {
            if (chain.charAt(i) == c){
                val = chain.toUpperCase().charAt(i);
            }else{
                val = chain.charAt(i);
            }
            newWord += val;
        }
        System.out.println(newWord);
    }

}
