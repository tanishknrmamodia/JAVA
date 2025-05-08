import java.util.*;
class Class_Objects_Methods6{
String name;
class Square{
int side;
int sqArea(){
return side*side;
}
}
static class Rectangle{
int width;
int height;
int recArea(){
return width*height;
}
}

public static void main(String args[]){
Scanner sc= new Scanner(System.in);

System.out.println( "enter shape name:"  ) ;
String str =sc.nextLine();
Class_Objects_Methods6 sh =new Class_Objects_Methods6();
sh.name=str;
if (sh.name.equals("Square")||sh.name.equals("square")){
Square sq= sh.new Square();
System.out.println("enter the side of the square:");
sq.side=sc.nextInt();
System.out.println("area of the square:"+sq.sqArea());
}
 else if (sh.name.equals("Rectangle")||sh.name.equals("rectangle")){
Rectangle rec=new Rectangle();
System.out.println("enter the width of the rectangle:");
rec.width=sc.nextInt();
System.out.println("enter the height of the rectangle:");
rec.height=sc.nextInt();
System.out.println("area of the Rectangle:"+rec.recArea());
}
else{
System.out.println("invalid shape entered");
}
}
}

