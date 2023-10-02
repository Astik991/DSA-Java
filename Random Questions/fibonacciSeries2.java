import java.util.*;
public class fibonacciSeries2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num==1||num==2) {
			for(int a=1;a<=num;a++) {
				System.out.print("1 ");
			}
		}
		else {
			int fibo1=1, fibo2=1, fibonacci=1; 
			for(int i= 3; i<= num; i++){ 
				fibonacci = fibo1 + fibo2; 
				fibo1 = fibo2; 
				fibo2 = fibonacci; 
				if(i==(num)){
                    System.out.print(fibonacci);
                }else{
                    System.out.print(fibonacci+", ");
                }
			}
		}
		sc.close();
	}

}