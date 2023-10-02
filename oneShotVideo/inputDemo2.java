import java.util.*;
public class inputDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String a = sc.nextLine();
        System.out.println("Enter Second String: ");
        String b = sc.next();
        System.out.println(a+b);
        sc.close();
    }
}
