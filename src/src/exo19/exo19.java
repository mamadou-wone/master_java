package exo19;

public class exo19 {

    public static void main(String[] args) {
        String [] tab = {"j", "k", "a", "l", "b"};
        //sortArray(tab);
        changePosition(tab, 2, 4);
    }

    public static String [] sortArray(String[] tab){
        String [] newTab = new String[tab.length];
        String temp = "";
        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if(tab[i].compareTo(tab[j]) > 0){
                    temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        for (String s : tab) {
            System.out.println(s);
        }
        return newTab;
    }

    public static void changePosition(String[] tab, int i, int j){
        String temp = "";
        temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
        for (String s : tab) {
            System.out.println(s);
        }
    }

}
