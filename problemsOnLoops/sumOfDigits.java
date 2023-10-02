import java.util.Scanner;

public class sumOfDigits {
    static void sum(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n=n/10;
        }
        System.out.print("The sum is: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No: ");
        int n = sc.nextInt();
        sum(n);
        sc.close();
    }    
}
