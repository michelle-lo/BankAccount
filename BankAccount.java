public class BankAccount {
  //instance variables
  private double balance;
  private int accountID;
  private String password;

  //constructor -- intialize stuff
  public BankAccount (int acc, String pass) {
    balance = 0;
    accountID = acc;
    password = pass;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public static void main (String[] args) {

  }
  //add methods here...
}
