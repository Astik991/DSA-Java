import java.util.*;
public class calCSI {
    static void si(double p, double r, double t){
        double si = (p*r*t)/100;
        System.out.println("The Simple Interest is:"+si);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal:");
        double principal = sc.nextDouble();
        System.out.println("Enter the Rate:");
        double rate = sc.nextDouble();
        System.out.println("Enter the Time:");
        double time = sc.nextDouble();
        si(principal,rate,time);
        sc.close();
    }
}
