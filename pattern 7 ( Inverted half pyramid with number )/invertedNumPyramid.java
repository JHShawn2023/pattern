import java.util.*;
public class invertedNumPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}