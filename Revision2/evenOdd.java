import java.util.*;
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive no: ");
        int n = sc.nextInt();
        if(n>0){
            if(n%2==0){
                System.out.println("It is Even.");
            }
            else{
                System.out.println("It is Odd.");
            }
        }
        else{
            System.out.println("Sorry! It's a Negative No.");
        }
        sc.close();
    }
}
