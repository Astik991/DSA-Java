import java.util.Scanner;

public class printFactorial {
    static void factorial(int n){
        long ans = 1;
        for(int i = 1;i<=n;i++){
            ans *=i;
            System.out.println("The Factorial of "+i+" is: "+ans);
        }
        // System.out.println("The Factorial of "+n+" is: "+ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No: ");
        int n = sc.nextInt();
        factorial(n);
        sc.close();
    }
}
