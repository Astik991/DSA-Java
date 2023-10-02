import java.util.*;

public class areaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter breadth of Rectangle: ");
        int b = sc.nextInt();
        int area = l * b;
        int perimeter = 2 * (l + b);
        if (area > perimeter) {
            System.out.println("Yes area is greater than perimeter.");
        }else if(area==perimeter){
            System.out.println("Area and Perimeter Both are Equal.");
        }
        else {
            System.out.println("No area is smaller than perimeter.");
        }
        sc.close();
    }
}
