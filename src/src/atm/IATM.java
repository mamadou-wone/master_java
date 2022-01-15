package atm;
/**
 * @author mamadou_wone
 */
public interface IATM {

    /**
     * Getting the current balance
     */
    public void getBalance();

    /**
     * @param amount
     */
    public void deposit(int amount);

    /**
     * @param amount
     */
    public void withdraw(int amount);

}
