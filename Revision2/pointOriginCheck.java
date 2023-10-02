import java.util.Scanner;

public class pointOriginCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the point: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x==0 && y==0){
            System.out.println("It lies at the Origin.");
        }else if(y==0){
            System.out.println("X-axis");
        }else if(x==0){
            System.out.println("Y-axis.");
        }else if(x>0 && y>0){
            System.out.println("First Quadrant.");
        }else if(x<0 && y>0){
            System.out.println("Second Quadrant.");
        }else if(x<0 && y<0){
            System.out.println("Third Quadrant.");
        }else{
            System.out.println("Fourth Quadrant.");
        }
        sc.close();
    }    
}
