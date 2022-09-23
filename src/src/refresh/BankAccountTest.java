package refresh;

import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount account = new BankAccount("Amir", "Boss", 1000.00);
        double balance = account.deposit(200.0, true);
        assertEquals(1200, balance, 0);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void withdraw() {
    }

    @org.junit.Test
    public void getBalance() {
    }
}