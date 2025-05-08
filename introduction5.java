import java.util.*;
public class introduction5{
public static void main (String args []){
int a,b,c;
int largest;
Scanner sc =new Scanner (System.in);
System.out.println("TANISHK NR MAMODIA      2330349");
System.out.println("enter a,b,c");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
largest = (a>b)?((a>c)?a:c):((b>c)?b:c);
System.out.println(" largest no is "+largest);
}}
