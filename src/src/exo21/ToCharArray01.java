package exo21;

public class ToCharArray01 {

    public static void main(String[] args) {
        charArrayFromString("Bonjour");
    }

    public static char [] charArrayFromString (String s){
        char[] charArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
        }
        for (Character c: charArray) {
            System.out.println(c);
        }
        return charArray;
    }

}
