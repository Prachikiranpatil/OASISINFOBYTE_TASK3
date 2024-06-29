import java.util.*;
public class App {
    public static void main(String[] args) 
     {
        int userid;
       int userpin;
       int choice;
       int Deposit;
       int result;
       int Withdraw;
       int Transfer;
       int accno;
       int Amount=20000;
  Scanner sc = new Scanner(System.in);
  System.out.println("enter user id :");
  userid=sc.nextInt();
  System.out.println("enter user pin:");
  userpin=sc.nextInt();
  while(true){
  System.out.println("enter your choice:");
  System.out.println("1.Balance  2.Withdraw  3.Deposit 4.Transfer  5.Quit");
choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.println("here's your Balance"+ Amount);
break;
case 2:
System.out.println("enter the amount you want to withdraw");
Withdraw=sc.nextInt();
System.out.println("your amount withdrawed successfully");
result=(Amount-Withdraw);
System.out.println("remaining balance is:"+ result);
break;
case 3:
System.out.println("enter amount you want to deposit:");
Deposit=sc.nextInt();
System.out.println("now your balance is:"+(Amount + Deposit));
break;
case 4:
System.out.println("enter bank accno where you want to transfer ");
accno=sc.nextInt();
System.out.println("Enter amount you want to transfer");
Transfer=sc.nextInt();
System.out.println("transferred successfully");
break;
case 5:
System.out.println("exiting...");
System.out.println("thank you! visit again");
break;
default:
System.out.println("invalid choice");
break;
}


    }
}


}
