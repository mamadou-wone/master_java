package review.factoriel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

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

    public static double getFactorielSum(int number){
        double sum = 1;
        for (int i = 1; i <= number; i++) {
            sum *= i;
        }
        return sum;
    }

    public static double calculateFactorial(){
        boolean start = true;
        int attempt = 0;
        double result = 0;
        while (start){
            System.out.println("Attempt: "+ attempt);
            int number = userNumberInput();
            if (number < 0 || number > 20){
                number = userNumberInput();
            }else {
                result = getFactorielSum(number);
                start = false;
            }
            if (attempt == 3){
                System.out.println("You make 3  attempts :(");
                start = false;
            }
            attempt++;
        }
        return result;
    }

}
