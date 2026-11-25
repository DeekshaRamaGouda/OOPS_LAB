import java.util.Scanner;
class Lab6{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter email address:");
String email=sc.nextLine();
int p=email.indexOf("@");
System.out.println("length:"+email.length());
System.out.println("username:"+email.substring(0,p));
String domain=email.substring(p+1);
System.out.println("domain:"+domain);
if(domain.equals("bmsce.ac.in"))
System.out.println("email belongs to bmsce");
else
System.out.println("email does not belongs to bmsce");
System.out.println("lowercase modified string:"+email.toLowerCase());
System.out.println("enter prefix");
String pre=sc.nextLine();
if(email.startsWith(pre))
System.out.println("email starts with a given prefix");
else
System.out.println("email does not starts with a given prefix");
if(email.endsWith("bmsce.ac.in"))
System.out.println("email ends with a valid domain");
else
System.out.println("email does not ends with a valid domain");
System.out.println("updated emain address:"+email.replace("bmsce.ac.in","cse.bmsce.ac.in"));
System.out.println("enter a character:");
String ch=sc.nextLine();
if(email.contains(ch))
System.out.println("email contains:"+ch);
else
System.out.println("email does not contains:"+ch);
System.out.println("trimmed email:"+email.trim());
System.out.println("enter second email  address:");
String email2=sc.nextLine();
if(email.equalsIgnoreCase(email2))
System.out.println("both emails are identical");
else
System.out.println("both emails are not identical");
sc.close();
}
}

