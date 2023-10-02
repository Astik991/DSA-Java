import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary No: ");
        int n = sc.nextInt();
        int ans = 0;
        int j = 1;
        while(n>0){
            ans += (n%2)*(j);
            j*=10;
            n=n/2;   
        }
        System.out.println(ans);
        
        sc.close();
    }    
}
