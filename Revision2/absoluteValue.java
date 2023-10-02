import java.util.*;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No: ");
        int n= sc.nextInt();
        if(n>=0){
            System.out.println("The absolute value of "+n+" is: "+n);
        }
        else{
            int m = n*(-1);
            System.out.println("The absolute value of "+n+" is: "+m);
        }
        sc.close();
    }
}
