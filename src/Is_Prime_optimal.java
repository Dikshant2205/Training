import java.util.Scanner;

public class Is_Prime_optimal {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int count =0;
        for(int i =1;i*i<=number;i++){
            if(number%i==0){
                if(i != number/i){count = count+2;}
                else{count++;}
            }
        }


        if(count == 2){
            System.out.println("Yay");
        }else{
            System.out.println("Nay");
        }

    }
}
