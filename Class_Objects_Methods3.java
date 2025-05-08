    class Box {
        double width;
        double height;
        double depth;
        double volume () {

        return width*height*depth ;
        }
         
        void setDim(double w,double h,double d ) {
        width = w;
        height = h ;
        depth = d ;
        }
        }
        public class Class_Objects_Methods3 {
        public static void main(String args [] ) {
        Box mybox = new Box () ;
        double vol ;
        mybox . setDim (50,60,70) ;
        vol = mybox.volume () ;
       
        System . out .println( "Volume of box is : " + vol ) ;
        }
        }
        

