public class Tester {
  public static void main (String[] args) {
    BankAccount b1 = new BankAccount(123455, "hello");
    System.out.println(b1.getBalance()); //0.0
    System.out.println(b1.getAccountID()); //9
    System.out.println("----setPassword----");
    System.out.println(b1.setPassword("goodbye")); //"goodbye"
    System.out.println("----deposit----");
    System.out.println(b1.deposit(0));
    System.out.println(b1.deposit(20));
    System.out.println(b1.deposit(-10));
    System.out.println(b1.deposit(30));
    System.out.println(b1.getBalance());
    System.out.println("----withdraw----");
    System.out.println(b1.withdraw(-10));
    System.out.println(b1.withdraw(20));
    System.out.println(b1.withdraw(10000));
    System.out.println(b1.getBalance());
    System.out.println("----toString----");
    System.out.println(b1.toString());

  }
  //add methods here...
}
