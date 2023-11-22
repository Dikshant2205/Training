import java.util.Scanner;

public class ReoccuringPattern {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int output = scan.nextInt();
        int nst = 1;
        int nsp = output / 2;
        int count = 1;
        for(int i=1;i<=output;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            if(i<=output/2){
                count = i;
            }else{
                count = output+1-i;
            }
            for(int k=0;k<nst;k++){
                System.out.print(count+ " ");
                if (k < nst / 2) {
                    count++;
                } else {
                    count--;
                }
            }
            if(i<=output/2){
                nsp--;
                nst=nst+2;
            }else{
                nsp++;
                nst=nst-2;
            }
            System.out.println();
        }
       /* Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;
        int nsp = n / 2;
        int val = 1;
        for(int i=1;i<=n;i++){
            for (int j = 0; j < nsp; j++) {
                System.out.print("  ");
            }
            if (i <= n / 2) {
                val = i;
            } else {
                val = n + 1 - i;
            }
            for (int k = 0; k < nst; k++) {
                System.out.print(val + " ");

                if (k < nst / 2) {
                    val++;
                } else {
                    val--;
                }
            }

            if (i <= n / 2) {
                nsp--;
                nst = nst + 2;
            } else {
                nsp++;
                nst = nst - 2;
            }
            System.out.println();
        }*/
    }
}