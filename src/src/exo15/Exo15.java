package exo15;

import exo14.FindChain;

public class Exo15 {

    public static int count = 0;
    public static int [] numberList = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static int extractSubChain(String chain, String subChain){
        // Mamadou Ibn Amir Boss WONE
        boolean isPresent = FindChain.find(chain, subChain);
        if (isPresent){
            count++;
            int lastIndex = chain.indexOf(subChain.toLowerCase()) + subChain.length() - 1;
            StringBuilder newWord = new StringBuilder();
            for (int i = lastIndex + 1; i < chain.length(); i++) {
                newWord.append(chain.charAt(i));
            }
            extractSubChain(newWord.toString(), subChain);
        }
        return count;
    }

    public static int[] extractNumber(String chain){
        int[] result = new int[numberList.length];
        for (int i = 0; i < numberList.length; i++) {
            if (FindChain.find(chain, Integer.toString(numberList[i]))){
                result[i] = numberList[i];
            }
        }
        return result;
    }

}
