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

  /*Change the value of password to the specified value
   *@param newPass The value to replace the old password with*/
  public String setPassword(String newPass) {
    password = newPass;
    return password;
  }

  public boolean deposit(double amount) {
    //if (amount < 0)
    return true;
  }

  public static void main (String[] args) {

  }
  //add methods here...
}
