import java.util.*;
public class areaOfCircle {
    static void area(double r){
        double pi = 3.1415;
        double area = pi*r*r;
        System.out.println("The area of Circle is:"+area);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of Circle:");
        double radius = sc.nextDouble();
        area(radius);
        sc.close();
    }
}
