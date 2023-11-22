import java.util.Scanner;

public class Functioncalling {
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int r = scan.nextInt();
        int nfact = Fact(number);
        int rfact = Fact(r);
        int nmrfact = Fact(number-r);
       // int n1 = Fact(number);
       // System.out.print(Fact(number));
        int anss = nfact/(rfact*nmrfact);
        System.out.println(nfact);
        System.out.println(rfact);
        System.out.println(nmrfact);
        System.out.println(anss);
    }

    public static int Fact(int n){
        int ans = 1;

        for(int i=1;i<=n;i++){
            ans = ans*i;
        }
        return ans;
    }
}
