import java.util.Scanner;

public class rectanglePattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Rows: ");
        int n = sc.nextInt();
        System.out.print("Enter No of Columns: ");
        int m = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                if(j==1 || j==m || i == 1 || i == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
