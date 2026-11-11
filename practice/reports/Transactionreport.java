package  reports;
import transaction.Account;
public class Transactionreport{
public void display(Account a){
System.out.println("account name:"+a.accno);
System.out.println("account balance:"+a.balance);
}
}