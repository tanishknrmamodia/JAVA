import java.util.*;
public class Operators_Selectors_Iterators2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter x : ");
int x = sc.nextInt();
System.out.println("Enter y : ");
int y = sc.nextInt();
int r = 5;
int z = ((x*x)+(y*y));
System.out.println("TANISHK NR MAMODIA    2330349");
if(z<(r*r))
{
System.out.println("The point ("+x+","+y+") lies within the circle");
}
else if(z>(r*r))
{
System.out.println("The point ("+x+","+y+") lies outside the circle");
}
else{
System.out.println("The point ("+x+","+y+") lies on the circle");
}}}
