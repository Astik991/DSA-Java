import java.util.Scanner;

public class pyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Rows: ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j =n;j>=1;j--){
                if(j<=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j = 1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
