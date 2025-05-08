
// by taking user input 

import java.util.*;

class Triangle{
    int a ;
    int b ;
    int c;     
    Triangle (){
        a=0;b=0;c=0;
    }
    void display () {
        System.out.println (" Side 1 of the Triangle is  : " + a );
        System.out.println (" Side 2 of the Triangle is  : " + b );
        System.out.println (" Side 3 of the Triangle is  : " + c );        
        }
        
    void check (){
        if ( (( a)*( a) == ( b)*( b) + ( c)*( c)) || (( b)*( b) == ( a)*( a) + ( c)*( c))|| (( c)*( c) == ( b)*( b) + ( a)*( a))) {
 
            System.out.println("this is a right angle triangle using pythogorous theorem");
        }
       else if (a==b && b==c && c==a) {
         System.out.println("this triangle is equilateral traingle");
       }
        else if (a==b ||b==c || c==a) {
        System.out.println("this triangle is isosceles triangle");
         }
        else {
            System.out.println("This is a normal triangle");
        }
        }
    }
         
public class Constructors3{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Triangle tri = new Triangle ();
    

    System.out.println("enter the side 1 of traingle:");
    tri.a= sc.nextInt();


    System.out.println("enter  the side 2 of traingle:");
    tri.b= sc.nextInt();
    
    System.out.println("enter the side 3 of traingle:");
    tri.c= sc.nextInt();


    tri.display(); 
    tri.check();
    }

    }


