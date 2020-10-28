public class Tester {
  public static void main (String[] args) {
    BankAccount b1 = new BankAccount(9, "hello");
    System.out.println(b1.getBalance()); //0.0
    System.out.println(b1.getAccountID()); //9
    System.out.println(b1.setPassword("goodbye")); //"goodbye"


  }
  //add methods here...
}
