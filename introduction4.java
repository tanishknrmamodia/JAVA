import java.util.*;

public class introduction4 {
    public static void main(String[] args) {
        int l,b;
        System.out.println("TANISHK NR MAMODIA     2330349");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of rectangle: \n");
        l=sc.nextInt();
         System.out.println("enter the breadth of rectangle: \n");
        b=sc.nextInt();
        int area_of_rectangle=l*b;
            System.out.println("area ="+area_of_rectangle);
            int perimetre_of_rectangle = (2*(l+b));
            System.out.println("perimeter="+perimetre_of_rectangle);

}
}