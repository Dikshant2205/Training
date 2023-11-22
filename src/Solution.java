import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int primenumber = scan.nextInt();
        String answer = isPrime(primenumber);
        if(answer.equals("Prime")) {
            System.out.println("Prime");
        } else{
            System.out.println("Not Prime");
        }
    }
    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
    static String isPrime(int primenumber){
        if(primenumber <=1){
            return "Not Prime";
        }
        for(int i=2;i<primenumber;i++)
            if(primenumber%i == 0)
                return "Not Prime";

        return "Prime";
    }
}