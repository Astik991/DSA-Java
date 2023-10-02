import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		String ans="";
		for(int a = 2;a<num;a++) {
			if(num%a==0) {
				ans="not a prime";
				break;
			}
			else {
				ans="is a prime";
			}
		}
		System.out.println(ans);
		
		sc.close();
	}    
}
