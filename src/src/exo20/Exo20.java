package exo20;

public class Exo20 {

    public static void main(String[] args) {
        int[] tab = {5, 3, 7, 9, 65, 12, 69};
        inverseArray(tab);
    }

    public static void inverseArray(int[] tab){
        int[] newArray = new int[tab.length];
        for (int i = tab.length - 1; i >= 0 ; i--) {
            newArray[tab.length - 1 - i] = tab[i];
        }
        for (int t: newArray) {
            System.out.println(t);
        }
    }
}
