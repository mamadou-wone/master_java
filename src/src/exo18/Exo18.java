package exo18;

public class Exo18 {
    public static char[] voys = {'a', 'e', 'i', 'u', 'o', 'y'};

    public static void main(String[] args) {
        getCharacter("Mamadou Ibn Amir Boss WONE");
    }

    public static char[] getCharacter(String chain){
        char list[] = new char[chain.length()];

        for (int i = 0; i < chain.length(); i++) {
            for (char voy : voys) {
                if (chain.toLowerCase().charAt(i) == voy)
                    list[i] = chain.charAt(i);
            }
        }
        for (char c: list) {
            System.out.println(c);
        }
        return list;
    }
}
