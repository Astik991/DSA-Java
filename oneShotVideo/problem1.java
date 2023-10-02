// Take two int inputs, a and b where a>b, and find the remainder when a is divided by b.
import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first No: ");
        int x = sc.nextInt();
        System.out.println("Enter second No: ");
        int y = sc.nextInt();
        if(x>y){
            int c = x%y;
            System.out.println("The remainder is: "+c);
        }
        else{
            System.out.println(x+" is less than "+y);
        }
        sc.close();
    }
}
