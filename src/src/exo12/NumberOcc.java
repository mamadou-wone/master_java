package exo12;

import java.util.Locale;

public class NumberOcc {

    public static char[] voys = {'a', 'e', 'i', 'u', 'o', 'y'};

    public static int getNbOcc (String s, char c){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
           if (s.toLowerCase().charAt(i) == c){
               count++;
           }
        }
        return count;
    }

    public static int getNbVoy (String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (char voy : voys) {
                if (s.toLowerCase().charAt(i) == voy) {
                    count++;
                }
            }
        }
        return count;
    }

}
