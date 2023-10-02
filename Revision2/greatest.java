import java.util.Scanner;

public class greatest {
    static void check(int x1,int x2,int x3){
        int greatest = 0;
        if(x1>=x2 && x1>=x3){
            greatest=x1;
        }else if(x2>=x1 && x2>=x3){
            greatest=x2;
        }else{
            greatest=x3;
        }
        System.out.println("The greatest No is: "+greatest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first No: ");
        int n1=sc.nextInt();
        System.out.println("Please enter second No: ");
        int n2=sc.nextInt();
        System.out.println("Please enter third No: ");
        int n3=sc.nextInt();
        if(n1<0 || n2<0 || n3<0){
            System.out.println("Please enter positive no only.");
        }else{
            check(n1,n2,n3);
        }
        sc.close();
    }
}
