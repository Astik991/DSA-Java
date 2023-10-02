
import java.util.Scanner;

public class reverseDigits {
    static void reverse(int n){
        int reverse = 0;
        while(n>9){
            reverse +=(n%10);
            n=n/10;
            reverse *=10;
            if(n<10){
                reverse+=n;
            }
        }
        
        System.out.println("The reverse of the no is: "+reverse);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No: ");
        int n = sc.nextInt();
        reverse(n);
        sc.close();
    }
}
