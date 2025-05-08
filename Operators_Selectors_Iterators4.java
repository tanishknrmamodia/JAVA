import java.util.*;
public class Operators_Selectors_Iterators4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("TANISHK NR MAMODIA     2330349");
System.out.println("Enter the total number of elements : ");
int n = sc.nextInt();
int a =0;int b =1;
System.out.print(" "+a+" "+b);
while(n>0)
{
int c = a+b;
System.out.print(" "+c);
a = b;
b = c;
n--;
}}}
