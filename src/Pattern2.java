import java.util.Scanner;

public class Pattern2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int increment = 1;
        for(int i=1;i<=number;i++){
            for(int j=1;j<=increment;j++) System.out.print("*");
            increment++;
            System.out.println();
        }
    }
}
