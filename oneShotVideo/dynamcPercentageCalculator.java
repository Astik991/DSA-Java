import java.util.*;
class dynamcPercentageCalculator{
    static void calC(double a,double b,double c,double d,double e){
        double p = (a+b+c+d+e)/5;
        System.out.println("The Percentage is:"+p+"%");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics Marks: ");
        double phy = sc.nextDouble();
        System.out.println("Enter Chemistry Marks: ");
        double che = sc.nextDouble();
        System.out.println("Enter Maths Marks: ");
        double maths = sc.nextDouble();
        System.out.println("Enter English Marks: ");
        double eng = sc.nextDouble();
        System.out.println("Enter Hindi Marks: ");
        double hindi = sc.nextDouble();
        calC(phy,che,maths,eng,hindi);
        sc.close();
    }
}