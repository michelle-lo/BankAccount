public class BankAccount {
  //instance variables
  private double balance;
  private int accountID;
  private String password;

  //constructor -- intialize stuff
  public BankAccount (int accountID, String password) {
    balance = 0;
    //accountID = acc;
    //password = pass;
    this.accountID = accountID;
    this.password = password;
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
     return "#" + accountID + "\t$" + balance;
   }

   /*This private method will allow internal methods to check the password easily*/
   /*Determine if the password in the object is the same as the parameter.
   *@param password to be checked against the object's password (remember the distinction between this.x and x)
   *@return true if the passwords are the same, false otherwise.
   */
   private boolean authenticate(String password) {
     return (this.password.equals(password));
   }

   /*Transfer money from this BankAccount to the other only when the password matches, and the withdrawal succeeds.
   *@param other which BankAccount to GIVE the money to
   *@param amount how much money to transfer, negative amounts will make this operation fail.
   *@param password to be checked against the source account, incorrect password will make this operation fail.
   *@return true if money is successfully transfered, false otherwise.
   */
  public boolean transferTo(BankAccount other, double amount, String password) {
    if (authenticate(password)) {
      if (amount <= balance && amount >= 0) {
          withdraw(amount);
          System.out.println(balance);
          other.deposit(amount);
          System.out.println(other.getBalance());
          return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }


}
