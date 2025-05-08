 class Box{
        double width;
        double height;
        double depth;
        double vol;
    }
    public class Class_Objects_Methods1{
    public static void main(String[] args) {
        Box box1 = new Box ();
        Box box2 = new Box ();
        box1.width=10;
        box1.height=20;
        box1.depth=30; 
        box1.vol=box1.height*box1.depth*box1.width; 
     

        box2.width=40;
        box2.height=50;
        box2.depth=60;
        box2.vol=box2.height*box2.depth*box2.width;
     
        double vol1;
        double vol2;
        vol1=box1.vol;
        vol2=box2.vol;
        
        System.out.println("Tanishk Nr Mamodia    2330349");
        System.out.println("volume 1 is :" +vol1);
        System.out.println("volume 2 is :" +vol2);

    }

    }
