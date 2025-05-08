// by taking user input 

import java.util.*;

class Box{
    double width;
    double height;
    double depth;
    double vol;
}
public class Class_Objects_Methods2{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Box box1 = new Box ();
    Box box2 = new Box ();

    System.out.println("enter the width of box1:");
    box1.width= sc.nextInt();

    System.out.println("enter the height of box1:");
    box1.height= sc.nextInt();
    
    System.out.println("enter the depth of box1:");
    box1.depth= sc.nextInt();
   
    box1.vol=box1.height*box1.depth*box1.width; 
 
    System.out.println("enter the width of box2:");
    box2.width= sc.nextInt();

    System.out.println("enter the height of box2:");
    box2.height= sc.nextInt();

    System.out.println("enter the depth of box2:");
    box2.depth= sc.nextInt();
   
    box2.vol=box2.height*box2.depth*box2.width;
 
    double vol1;
    double vol2;
    vol1=box1.vol;
    vol2=box2.vol;
    

    System.out.println("volume 1 is :" +vol1);
    System.out.println("volume 2 is :" +vol2);

}}
