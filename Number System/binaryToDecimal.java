import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary No: ");
        int n = sc.nextInt();
        int cons = n;
        boolean check=true;
        while(n>0){
            int i=n%10;
            n=n/10;
            if(i==0 || i==1){
                check = true;
            }else{
                check=false;
                break;
            }
        }
        int ans = 0;
        int power = 1;
        if(check==true){
            while(cons>0){
                ans +=(cons%10)*(power);
                power *=2;
                cons=cons/10; 
            }
            System.out.print("The binary to decimal conversion is: "+ans);
        }else{
            System.out.print("Please enter 0 and 1 only.");
        }
        sc.close();
    }    
}
