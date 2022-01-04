package master;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the size of the triangle : ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String draw = "";
        while (len != 0){
            for (int i = 0; i < len; i++) {
                draw += "*";
            }
            System.out.println(draw);
            draw = "";
            len --;
        }

    }
}
