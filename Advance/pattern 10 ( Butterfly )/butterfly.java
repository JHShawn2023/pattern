import java.util.*;
public class butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // *      *
        // **    **
        // ***  ***
        // ********
        // ********
        // ***  ***
        // **    **
        // *      *

        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(4-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=4; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(i-1); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=5-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}