
import java.util.*;

class Account {
int account_number;
double balance;
String name;

void disp(){
    System.out.println("\n\n\n");
    System.out.println("The Account number is : \n" +account_number+"\n");
    System.out.println("Balance:\n"+balance+"\n");
    System.out.println("Account holder:\n"+name+"\n");
}

void credit(){
    Scanner sc = new Scanner(System.in);
    double x ;
    System.out.println("Enter the Amount you have to credit :\n");
    x=sc.nextDouble();
    double y = x+balance;
    System.out.println("\nA/C credited with Rs."+x+" and the total Balance is : Rs.\n"+y);

}
void debit(){
    Scanner sc = new Scanner(System.in);
    double a ;
    System.out.println("Enter the Amount you have to debit :\n");
    a=sc.nextDouble();
    double b = balance-a;

    if (balance>=a) {
        System.out.println("\nA/C debited with Rs."+a+" and the total Balance is : Rs.\n"+b);
    }
    else{
        System.out.println("\nA/C debited with Rs.0 due to insufficient balance.");
    }
    


}
}



public class Constructors5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account();
      

        System.out.println("Enter the Account number : ");
        acc.account_number=sc.nextInt();

        System.out.println("Enter the Balance : ");
        acc.balance=sc.nextDouble();

        sc.nextLine(); //to remove buffer

        System.out.println("Enter the Account holder name:");
        acc.name=sc.nextLine();

acc.disp();
acc.credit();
acc.debit();
    }
}
