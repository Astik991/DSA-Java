import java.util.*;
public class areaOfRectangle {
    static void area(int l,int b){
        int area = l*b;
        System.out.print("The area is: "+area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of rectangle: ");
        int breadth = sc.nextInt();
        area(length,breadth);
        sc.close();
    }
}
