import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to check: ");
        int n = sc.nextInt();
        if(n%4==0){
            System.out.println("It's a leap year.");
        }
        else{
            System.out.println("It's not a leap year.");
        }
        sc.close();
    }
}
