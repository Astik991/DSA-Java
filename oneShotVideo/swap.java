import java.util.*;
public class swap {
    static void swaping(int a,int b){
        int c = a;
        a=b;
        b=c;
        System.out.println("Swapped First No is: "+a);
        System.out.print("Swapped Second No is: "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First No: ");
        int a = sc.nextInt();
        System.out.println("Enter Second No: ");
        int b = sc.nextInt();
        swaping(a,b);
        sc.close();
    }
}
