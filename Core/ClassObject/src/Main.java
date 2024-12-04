class BankAccount { // creating class BankAccount
  String owner; // declare property
  int balance; // declare property

  BankAccount(String owner, int balance) { // constructor
    this.owner = owner; // initialize property value
    this.balance = balance; // initialize property value
  }

  void withdraw(int amount) { // withdraw behavior
    if(amount > this.balance) {
      throw new RuntimeException("Insufficient funds");
    }
    balance -= amount;
  }

  void deposit(int amount) { // deposit behavior
    balance += amount;
  }
}

public class Main {
  public static void main(String[] args) {
    BankAccount davesAccount = new BankAccount("Dave", 100); // initializing instance of BankAccount class
    davesAccount.withdraw(10); // calling withdraw method behavior
    davesAccount.deposit(500); // calling deposit method behavior
    System.out.println(davesAccount.balance); // => outputs 590
  }
}