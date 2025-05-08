import java.util.*;

class Complex{
int x , a ;
int y , b ;
Complex (){
    x=0;a=0;b=0;y=0;
}

// x + iy
// a + ib
void display () {
    System.out.println ("Complex number 1 : ");  

    if (y<=0) {
        System.out.println (+ x +" - i" + (-1)*y);  

    }
    else{
    System.out.println (+ x +" + i" +y);  
    }
    System.out.println ("Complex number 2 : ");
    if (b<=0) {
        System.out.println (+ a +" - i" + (-1)*b);      
    }
    else{
    System.out.println ( + a +" + i" +b);               
    }
}    // int real(){
    //       return (x + a) ;
    //     }
    // int imag(){ 
    //      return (y + b) ;
    //     }

void add (){
    int real = x + a; 
    int imag = y + b ;
    System.out.println("The sum of two complex number is :");
    
       if (imag<0) {
        System.out.println(real+"- i"+ (-imag));
       }
       else {
        System.out.println(real+"+ i"+ imag);
       }
   
}


void product (){

    int p = x*a - y*b ;
    int q = x*b + y*a ;

    System.out.println("The product of two complex number is :");
    if (q < 0) {
        System.out.println(p + " - i" + (-q));
    } else {
        System.out.println(p + " + i" + q);
    }
}
}

public class Constructors4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Complex com = new Complex ();
    

    System.out.println("Enter two Real parts of two complex number:");
    com.x= sc.nextInt();
    com.a= sc.nextInt();


    System.out.println("Enter two Imaginary parts of two complex number:");
    com.y= sc.nextInt();
    com.b= sc.nextInt();
    com.display();
    com.add();
    com.product();
}
}
