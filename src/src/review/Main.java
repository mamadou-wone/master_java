package review;

import exo11.ReverseChain;
import review.factoriel.Factorial;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*Cercle cercle = new Cercle(new Point(2, 3), 4);
    cercle.display();*/
/*        Point point = new Point(1, 20);
        point.translate(20, -1);
        point.display();*/
      /*  System.out.println(point.coicide(new Point(0, 0)));*/
    //    System.out.println(Factorial.calculateFactorial());
    //    drawTriangle(10);
    //    System.out.println( harmonicSum());
    //    System.out.println(delta(3, -6, -2));
    //    System.out.println(Arrays.toString(userNumbersInput()));
       // System.out.println(ReverseChain.reverseChain("bonjour"));;
    }

    /**
     * Exo 2
     * @param m
     */
    public static void drawTriangle(int m){
        String [] draw = new String[m];
        String d = "";
        for (int i = 0; i < draw.length; i++) {
            d += "*";
            draw[i] = d;
        }
        for (int i = draw.length - 1; i >= 0; i--) {
            System.out.println(draw[i]);
        }
    }

    /**
     * Exo 3
     * @return
     */
    public static int userNumberInput(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a valid number: ");
            return sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Invalid input ");
        }
        return -1;
    }

    /**
     * Exo 3
     * @param number
     * @return
     */
    public static float getHarmonicSum(float number){
        float sum = 0;
        for (float i = 1; i <= number; i++) {
            sum += 1 / i;
        }
        return sum;
    }

    /**
     * Exo 3
     * @return
     */
    public static float harmonicSum(){
        boolean start = true;
        int number = 0;
        int attempt = 0;
        number = userNumberInput();
        while (start){
            attempt ++;
            System.out.println("Attempt : "+ attempt);
            if (number < 1 || number > 100){
                System.out.println("Number out of range :(");
                number = userNumberInput();
            }else {
                start = false;
            }
            if (attempt == 5){
                System.out.println("You make 5 attempt sorry you v=cannot continue :(");
                start = false;
            }
        }
        return getHarmonicSum(number);
    }


    /**
     * Exo 4
     * @return
     */
    public static double[] userNumbersInput(){
        System.out.println("Donner un a valide: ");
        int a = userNumberInput();
        System.out.println("Donner un b valide: ");
        int b = userNumberInput();
        System.out.println("Donner un c valide: ");
        int c = userNumberInput();
// 2 -1 -6
        int delta = delta(a, b, c);
        if (delta > 0){
            double x1 = ((-1)* b - Math.sqrt(delta)) / (2 * a);
            double x2 = ((-1)* b + Math.sqrt(delta)) / (2 * a);
            return new double[]{x1, x2};
        }else if (delta < 0){
            int x = -1;
            return new double[]{};
        }else {
            int x0 = (int) ((-1 * b) / 2*a);
            return new double[]{x0};
        }
    }

    /**
     * Exo 4
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int delta(int a, int b, int c){
        return (int) (Math.pow(b, 2)  - 4 * a * c);
    }

}
