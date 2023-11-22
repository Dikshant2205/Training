import java.util.Scanner;

public class PositiveFactor {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) if (number % i == 0) System.out.print(i + " ");
    }
}
