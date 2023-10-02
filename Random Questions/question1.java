// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

class question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No or x for quitting: ");
        String n = "";
        int ans=0;
        while(!n.equals("x")){
            n = sc.nextLine();
            if(!n.equals("x")){
                int sum =Integer.parseInt(n);
                ans +=sum;
            }   
        }
        System.out.println("The Sum is: "+ans);
        sc.close();
    }
}