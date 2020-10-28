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

  /*Only when amount is positive: Increase balance by amount and return true.
   *@return When amount is positive: Return true, otherwise return false.
   *@param amount The amount is how much to change the balance by.
   */
  public boolean deposit(double amount) {
    if (amount >= 0) {
      balance += amount;
      return true;
    } else {
      return false;
    }
  }

   /*Only when amount is positive and the amount does not exceed the balance:
   *Decrease balance by amount and return true, return false otherwise.
   *Make no change if the amount is too large to withdraw
   *@param amount The amount is how much to change the balance by.
   *@return true when the balance is large enough, false otherwise.
   */
   public boolean withdraw(double amount) {
     if (amount <= balance && amount >= 0) {
       balance -= amount;
       return true;
     } else {
       return false;
     }
   }

   /*Return a String to be used to display the account data. "ACCOUNT\tBALANCE" */
   public String toString(){
     return accountID + "\t" + balance;
   }

}
