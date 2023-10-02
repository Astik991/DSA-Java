import java.util.*;
public class volumeOfSquare {
    static void volume(double r){
        double volume = r*r*r;
        System.out.println("Volume of Square is:"+volume);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the volume of Square:");
        double r = sc.nextDouble();
        volume(r);
        sc.close();
    }
}
