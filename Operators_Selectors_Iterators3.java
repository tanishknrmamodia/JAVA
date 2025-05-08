
import java.util.Scanner;

public class Operators_Selectors_Iterators3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds,H,M,S;
        System.out.println("Tanishk Nr Mamodia    2330349");

        System.out.println("Enter the number of seconds :");
        seconds = sc.nextInt();
        
        H=seconds/3600;
        M=(seconds%3600)/60;
        S=(seconds%3600)%60;

        System.out.println("Time in HH:MM:SS is "+H+":"+M+":"+S+"");

        
    }
}