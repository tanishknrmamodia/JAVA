import java.util.*;

class Rectangle{
    double length;
    double width;
    double area;
    double perimiter;
}
public class Class_Objects_Methods4{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Rectangle rec1 = new Rectangle ();
    

    System.out.println("enter the length of rectangle:");
    rec1.length= sc.nextInt();

    System.out.println("enter the width of rectangle:");
    rec1.width= sc.nextInt();
    
   
    rec1.area=rec1.length*rec1.width;
    rec1.perimiter=2*(rec1.length+rec1.width);
 
    
    
    

    System.out.println("area of rectangle is :" + rec1.area);
    System.out.println("perimiter of rectangle is  :" +rec1.perimiter);

}}
