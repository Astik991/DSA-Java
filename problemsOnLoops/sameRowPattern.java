import java.util.Scanner;

public class sameRowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows: ");
        int n = sc.nextInt();
        System.out.print("Enter no of Rows: ");
        int m = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
