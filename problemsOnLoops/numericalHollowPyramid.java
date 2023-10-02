import java.util.Scanner;

public class numericalHollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == n) {
                    System.out.print(n);
                } else if (j == i) {
                    System.out.print(j);
                }
            }
            for (int j = i - 1; j > 0; j--) {
                if (i != n) {
                    System.out.print(" ");
                }
            }
            for (int j = i - 2; j > 0; j--) {
                if (i != n) {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j < n; j++) {
                if (i == n) {
                    System.out.print(n);
                } else if (j == i) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
