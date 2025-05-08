class BoolPattern{
    private int A,B,C;
    BoolPattern(){
        A=B=C=0;
    }
    void pattern(int a){
        System.out.println("Boolean Pattern for one variable");
        for(int i=0;i<Math.pow(2,1);i++){
        System.out.println(Integer.toBinaryString(i));
        }
        
    }
    void pattern(int a, int b){
        System.out.println("Boolean Pattern for two variables");
        for(int i=0;i<Math.pow(2,b);i++){
            if(i<b){
        System.out.println("0"+Integer.toBinaryString(i));
            }
            else{
                System.out.println(Integer.toBinaryString(i));
            }
    }
    }
    void pattern(int a, int b, int c){
        System.out.println("Boolean Pattern for Three variables");
        for(int i=0;i<Math.pow(2,c);i++){
            if(i<b){
                System.out.println("00"+Integer.toBinaryString(i));
            }
            else if(i>=b&&i<=c){
            System.out.println("0"+Integer.toBinaryString(i));
            }
            else{
                System.out.println(Integer.toBinaryString(i));
            }
        }
    }
}
public class Polymorphism6 {
    public static void main(String[]args){
        BoolPattern bp = new BoolPattern();
        bp.pattern(1);
        bp.pattern(1,2);
        bp.pattern(1,2,3);
    }
}
