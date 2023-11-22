import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number<0)
            number = number*-1;
        while(number!=0) {
            int reversethenumbers = number % 10;
            System.out.print(reversethenumbers);
            number = number/10;
        }
    }
}