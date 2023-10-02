import java.util.Scanner;

public class divisibleBy5n3 {
    static void check(int n){
        if(n%5==0 && n%3==0){
                System.out.println("It's divisible by 5 and 3 both.");
            }else if(n%5==0){
                System.out.println("It's divisible by 5.");
            }else if(n%3==0){
                System.out.println("It's divisible by 3.");
            }else{
                System.out.println("It's not divisible by any No.");
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Positive Integer: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Please enter Positive No. Only.");
        }else{
            check(n);
        }
        sc.close();
    }
}
