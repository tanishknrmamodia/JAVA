class Rectangle{
    int height;
    int width;
    String name;
    Rectangle(){

        height =0;
        width=0;
    }
    void display(){
        System.out.println(width);
        System.out.println(height);
        System.out.println(name);

    }
}
public class Constructors6 {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        rec.display();

    }
}