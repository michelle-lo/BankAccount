public class Tester {
  public static void main (String[] args) {
    BankAccount b1 = new BankAccount(123455, "hello");
    System.out.println(b1.getBalance()); //0.0
    System.out.println(b1.getAccountID()); //123455
    System.out.println("----setPassword----");
    System.out.println(b1.setPassword("goodbye")); //"goodbye"
    System.out.println("----deposit----");
    System.out.println(b1.deposit(0)); //true --> 0
    System.out.println(b1.deposit(20)); //true --> 20
    System.out.println(b1.deposit(-10)); //false --> 20
    System.out.println(b1.deposit(30)); //true --> 50
    System.out.println(b1.getBalance()); //50
    System.out.println("----withdraw----");
    System.out.println(b1.withdraw(-10)); //false --> 40
    System.out.println(b1.withdraw(20)); //true --> 30
    System.out.println(b1.withdraw(10000)); //false --> 30
    System.out.println(b1.getBalance()); //30
    System.out.println("----toString----");
    System.out.println(b1.toString()); //#123455	$30.0

  }
}
