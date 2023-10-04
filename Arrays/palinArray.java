import java.util.*;
class palinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            GfG g = new GfG();
            System.out.println(g.palindromicArray(a, n));
        }
        sc.close();
    }
}
class GfG {
    public int palindromicArray(int[] a, int n) {
        int temp;
        int r;
        int sum;
        int ret = 1;
        for (int i = 0; i < n; i++) {
            sum = 0;
            temp = a[i];
            while (temp > 0) {
                r = temp % 10;
                sum = (sum * 10) + r;
                temp = temp / 10;
            }
            if (a[i] == sum) {
                ret = 1;
            } else {
                ret = 0;
                break;
            }
        }
        return ret;
    }
}
