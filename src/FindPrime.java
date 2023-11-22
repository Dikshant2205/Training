import java.util.*;


public class FindPrime {
//    public static void main(String args[] ) throws Exception {
//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        boolean s = isPrime(number);
//        if(s) {
//            System.out.println("Prime");
//        } else{
//            System.out.println("Not Prime");
//        }
//    }
//    static boolean isPrime(int number)
//    {
//        // Corner case
//        if (number <= 1)
//            return false;
//
//        // Check from 2 to n-1
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int pnum = scan.nextInt();
        int count = 0;
        if(pnum == 1 || pnum == 0)
            System.out.println("The number" + " " + pnum + " " + "is neither a prime nor composite");
        for(int i=1;i<=pnum;i++){
            if(pnum % i == 0){
                count ++;
            }
        }
        if(count == 2){
            System.out.println("It's a prime number" +" "+ pnum);
        }else{
            System.out.println("It's is a composite number"+" "+ pnum);
        }
    }
}