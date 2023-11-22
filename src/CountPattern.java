import java.util.Scanner;

import static java.lang.System.*;

public class CountPattern {
    public static void main(String [] args){
        Scanner scan = new Scanner(in);
        int number = scan.nextInt();
        int count = 1;
        int increment = 1;
        for(int i=1;i<=number;i++){
            for(int j=1;j<=increment;j++){
                out.print(count +" ");
                //out.print(count+ ' ');
                count++;
            }
            increment++;
            out.println();
        }
    }
}
