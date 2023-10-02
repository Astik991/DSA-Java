import java.util.Scanner;
public class greaterAge {
    static void check(int r,int s,int a){
        if(r==s && r==a){
            System.out.println("Ram Shyam and Ajay all have same ages.");
        }
        else if(r==s){
            if(r>a){
                System.out.println("Ram & Shyam.");
            }else{
                System.out.println("Ajay.");
            }
        }else if(s==a){
            if(s>r){
                System.out.println("Shyam & Ajay.");
            }else{
                System.out.println("Ram.");
            }
        }else if(r==a){
            if(r>s){
                System.out.println("Ram & Ajay.");
            }else{
                System.out.println("Shyam");
            }
        }else if(r>a && r>s){
            System.out.println("Ram.");
        }else if(s>r && s>a){
            System.out.println("Shyam.");
        }else{
            System.out.println("Ajay.");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Ram's age: ");
        int ram = sc.nextInt();
        System.out.print("Enter Shyam's age: ");
        int shyam = sc.nextInt();
        System.out.print("Enter Ajay's age: ");
        int ajay = sc.nextInt();
        if(ram<0 || shyam<0 || ajay<0){
            System.out.println("Ages cannot be negative.");
        }else{
            check(ram,shyam,ajay);
        }
        sc.close();
    }    
}
