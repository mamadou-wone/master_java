package exo14;

import java.util.Locale;

public class FindChain {

    public static boolean find (String chain, String fChain){
        return chain.toLowerCase().contains(fChain.toLowerCase());
    }

}
