package exo13;

public class WordExistInList {

    public boolean wordInList(String word, String[] list){
        for(String s: list){
            if (s.equals(word)){
                return true;
            }
        }
        return false;
    }

}
