import java.util.Scanner;

public class threeNoFormTriangleCheck {
    static void check(int n1,int n2,int n3){
        if((n1+n2)>n3 && (n1+n3)>n2 & (n2+n3)>n1){
            System.out.println("Yes, they can form a Triangle.");
        }else{
            System.out.println("No, they can't form a Triangle.");
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
            System.out.println("Please enter Positive No only.");
        }else{
            check(n1,n2,n3);
        }
        sc.close();        
    }
}
