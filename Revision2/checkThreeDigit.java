import java.util.Scanner;

public class checkThreeDigit {
    static void check(int n){
        int count = 0;
        while(n>0){
            n=n/10;
            count++;
        }
        if(count==3){
            System.out.println("It's a 3 digit No.");
        }else{
            System.out.println("It's not a three digit No.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive Integer: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Please Enter Positive No. only.");
        }else{
            check(n);
        }
        sc.close();
    }    
}
