import java.util.*;
public class solidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //     ****
        //    **** 
        //   ****  
        //  ****   
        // ****    

        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}