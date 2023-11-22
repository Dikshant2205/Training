import java.util.Scanner;

public class PyramidPattern {
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);
        int number = scan.nextInt();
        int reminder = number/2;
        /* System.out.println("The reminder is "+ reminder); */
        int count = 1;
        for(int i=1; i<=number;i++){
            for(int j=1;j<=reminder;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=count;k++){
                System.out.print("*");
            }
            if(i<=number/2){
                //System.out.println("The reminder is "+ reminder);
                reminder--;
                count = count+2;
            }else{
                reminder++;
                count = count-2;
            }
            System.out.println();
        }

    }
}
