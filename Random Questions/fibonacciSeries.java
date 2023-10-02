import java.util.*;
public class fibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Please Enter Number Upto Which Fibonacci Series to be printed: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans[] = new int[num];
		if(num==1 || num==2) {
			System.out.println("1");
		}
		else {
			ans[0]=1;
			ans[1]=1;
			System.out.print(ans[0] +", ");
			System.out.print(ans[1] +", ");
			for(int a=2;a<num;a++) {
				ans[a] = ans[a-1]+ans[a-2];
				if(a==(num-1)){
                    System.out.print(ans[a]);
                }else{
                    System.out.print(ans[a] +", ");
                }
			}
		}
		sc.close();

	}

}
