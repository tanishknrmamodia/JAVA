import java.util.Scanner;
public class Operators_Selectors_Iterators5{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
double s=0;
int c=0;
int num=n;
int rem=0;
System.out.println("TANISHK NR MAMODIA     2330349");
while(num>0)
{
num=num/10;
c++;
}
num=n;
for(int i=0;i<c;i++)
{
rem=num%10;
s=s+(Math.pow(rem,c));
num=num/10;
}
if(n==s){
System.out.println("This is an Armstrong number");
}
else{
System.out.println("This is not an Armstrong number");
}}}