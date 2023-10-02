import java.util.Scanner;

public class allPointsOnStraightLineCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 and y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter x2 and y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Enter x3 and y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        if(((y2-y1)/(x2-x1)) == ((y3-y1)/(x3-x1))){
            System.out.println("Yes.");
        }else{
            System.out.println("No.");
        }
        sc.close();
    }    
}
