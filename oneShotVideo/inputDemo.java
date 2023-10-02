import java.util.Scanner;

public class inputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Your Roll No: ");
        int rollNo = sc.nextInt();
        System.out.println("Enter Your Field of Interest: ");
        String field = sc.next();
        System.out.print("Name: " + name + ",Roll number: " + rollNo + ",Field of Interest: " + field);
        sc.close();
    }
}
