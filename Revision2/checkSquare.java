
import java.util.Scanner;

public class checkSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Rectangle: ");
        int l=sc.nextInt();
        System.out.println("Enter breadth of Rectangle: ");
        int b=sc.nextInt();
        if(l==b){
            System.out.println("This is a square.");
        }
        else{
            System.out.println("This is not a square.");
        }
        sc.close();
    }
}
