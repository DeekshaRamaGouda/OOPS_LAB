import transaction.Account;
import reports.Transactionreport;
public class Main{
public static void main(String[] args){
Account a=new Account();
a.accno="hdfc76564";
a.balance=8000;
a.deposit(4000);
a.withdraw(2000);
Transactionreport r=new Transactionreport();
r.display(a);
}
}