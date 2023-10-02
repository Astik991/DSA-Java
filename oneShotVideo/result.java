import java.util.*;
public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Subject Marks: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Subject Marks: ");
        int b = sc.nextInt();
        System.out.println("Enter Third Subject Marks: ");
        int c = sc.nextInt();
        int x= a+b+c;
        System.out.println("Total marks: "+x);
        x= x/3;
        System.out.println("Percentage marks: "+x+"%");
        sc.close();
    }
}
