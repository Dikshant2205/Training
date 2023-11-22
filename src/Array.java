import java.util.Scanner;

public class Array {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int array [] = new int[number];
        for(int j=0;j<=number;j++){
            array[j] = scan.nextInt();
        }
        int min = Integer.MIN_VALUE;
        for(int i=0;i<=number;i++){
            if(min<array[i]){
                min = array[i];
            }
        }
        System.out.println(min);

    }
}
