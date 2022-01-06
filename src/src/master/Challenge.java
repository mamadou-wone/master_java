package master;

public class Challenge {

    public static void main(String[] args) {
//        int [] tab0 = {1, 3, 4, 1, 2};
//        int [] tab1 = {6, 2, 7, 2, 3};
//        int [] sum = new int [tab0.length];
//        for (int i = 0; i < sum.length; i++) {
//            sum[i] = tab1[i] + tab0[i];
//        }
        int sum = 9;
        int [] tab = {1, 3, 5 , 6, 11, 23};
        int temp;
        int [] arr = {0, 1, 2, 3, 4, 5};
        int rev_arr [] = new int [arr.length];

        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            rev_arr[index] = arr[i];
            index++;
        }
        arr = rev_arr;

//        for (int i = 0; i < tab.length; i++) {
//            for (int j = 0; j < tab.length; j++) {
//                if (tab[i] + tab[j] == sum){
//                    System.out.println("This two numbers are: x: "+ tab[i]+ " and y: "+ tab[j]);
//                    break;
//                }
//            }
//        }
//
        for (int i: arr) {
            System.out.println(i);
        }
    }

}
