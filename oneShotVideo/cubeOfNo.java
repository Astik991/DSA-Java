import java.util.*;
public class cubeOfNo {
    static void cube(int n){
        int cube = n*n*n;
        System.out.print("The cube of "+n+" is: "+cube);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No: ");
        int n = sc.nextInt();
        cube(n);
        sc.close();
    }
}
