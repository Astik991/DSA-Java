import java.util.Scanner;

public class threeNoFormRightAngleTriangleCheck {
    static void check(int x1,int x2,int x3){
        int greatest = 0;
        int smallest1 = 0;
        int smallest2 = 0;
        if(x1>x2 && x1>x3){
            greatest=x1;
            smallest1=x2;
            smallest2=x3;
        }else if(x2>x1 && x2>x3){
            greatest=x2;
            smallest1=x1;
            smallest2=x3;
        }else{
            greatest=x3;
            smallest1=x2;
            smallest2=x1;
        }
        int triangle = (smallest1*smallest1)+(smallest2*smallest2);
        if(triangle==(greatest*greatest)){
            System.out.println("Yes,It can form a Triangle.");
        }else{
            System.out.println("No,It can not form a Triangle.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First No: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second No: ");
        int n2 = sc.nextInt();
        System.out.print("Enter Third No: ");
        int n3 = sc.nextInt();
        if(n1<0 || n2<0 || n3<0){
            System.out.println("Please enter Positive No. Only.");
        }else{
            check(n1,n2,n3);
        }
        sc.close();
    }    
}
