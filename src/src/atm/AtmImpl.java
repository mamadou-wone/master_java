package atm;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class AtmImpl implements IATM{
    private int balance;

    public AtmImpl(int balance) {
        this.balance = balance;
    }

    public void makeNewTransaction(){
        boolean start = true;
        Scanner sc = null;
        int count = 0;
        while (start) {
            try {
                System.out.println("Would you like to make an other transaction y/n ?");
                sc = new Scanner(System.in);
                String response = sc.nextLine();
                if (Objects.equals(response, "y")) {
                    initOperation();
                }
                System.out.println("Thanks you and see you next :)");
                start = false;
            } catch (InputMismatchException e) {
                System.out.println("Input not allowed :( ");
                count ++;
                if (count == 3){
                    System.out.println("You cannot make this operation right now :(");
                    start = false;
                }
            }
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Your current balance is " + balance + " CFA");
        makeNewTransaction();
    }

    @Override
    public void deposit(int amount) {
        if (amount > 0){
            balance += amount;
            System.out.println("Transaction successfully complete ");
        }
    }

    @Override
    public void withdraw(int amount) {
        if (amount > balance){
            System.out.println("You don't have enough money on your account");
            initOperation();
        }else {
            balance -= amount;
            System.out.println("Transaction successfully complete ");
            makeNewTransaction();
        }
    }

    public void initOperation(){
        int inputCount = 0;
        boolean start = true;
        while(start){
            System.out.println("Hello what do you want ? ");
            System.out.println("*********************************** ");
            System.out.println("0 - Show current balance ? ");
            System.out.println("1 - Withdraw 100 000 CFA ? ");
            System.out.println("2 - Withdraw 200 000 CFA ? ");
            System.out.println("3 - Withdraw 250 000 CFA ? ");
            System.out.println("4 - Withdraw 500 000 CFA ? ");
            System.out.println("5 - Other  ");
            try {
                Scanner sc = new Scanner(System.in);
                int input = sc.nextInt();
                switch (input) {
                    case 0 -> {
                        getBalance();
                        start = false;
                    }
                    case 1 -> {
                        System.out.println("You are going to make a withdrawal of 100 000 CFA");
                        withdraw(100000);
                        start = false;
                    }
                    case 2 -> {
                        System.out.println("You are going to make a withdrawal of 200 000 CFA");
                        withdraw(200000);
                        start = false;
                    }
                    case 3 -> {
                        System.out.println("You are going to make a withdrawal of 250 000 CFA");
                        withdraw(250000);
                        start = false;
                    }
                    case 4 -> {
                        System.out.println("You are going to make a withdrawal of 500 000 CFA");
                        withdraw(500000);
                        start = false;
                    }
                    case 5 -> {
                        System.out.println("Please enter the amount that you want to withdraw !");
                        Scanner amountInput = null;
                        boolean startWithdraw = true;
                        while (startWithdraw){
                            try {
                                amountInput = new Scanner(System.in);
                                int amount = amountInput.nextInt();
                                withdraw(amount);
                                startWithdraw = false;
                                start = false;
                            }catch (InputMismatchException e){
                                System.out.println("This action is not allowed :( . Please enter an right amount !");
                            }
                        }
                    }
                    default -> {
                        System.out.println("We cannot understand your choice sorry :(");
                        start = false;
                    }
                }
            }catch (InputMismatchException e){
                System.out.println("This action is not allowed :( . Please choose a good option !");
                inputCount ++;
                if (inputCount == 3){
                    start = false;
                    System.out.println("Sorry we cannot process for your request :(");
                }
            }
        }
    }
}
