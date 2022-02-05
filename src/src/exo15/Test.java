package exo15;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String chain = "Mamado8u Ibn Ami3r Boss WON5E Am";
        System.out.println(Exo15.extractSubChain(chain.toLowerCase(), "x"));
        System.out.println(Arrays.toString(Exo15.extractNumber(chain)));
    }
}
