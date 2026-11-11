package transaction;
public class Account{
public String accno;
public double balance;
public void deposit(double amount){
balance=balance+amount;
System.out.println("deposited amount:"+amount);
System.out.println("balance after deposit:"+balance);
}
public void withdraw(double amount){
balance=balance-amount;
System.out.println("withdrawn amount:"+amount);
System.out.println("balance after withdrawn:"+balance);
}
}
