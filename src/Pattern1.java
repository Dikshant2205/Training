import java.util.Scanner;

public class Pattern1 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=n;i>=0;i--){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
