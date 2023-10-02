import java.util.Scanner;

public class pointOnCircleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Specify the coordinates of circle(x,y): ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print("Specify the radius of circle(r): ");
        int r = sc.nextInt();
        System.out.print("Specify the coordinates of point(x1,y1): ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        if((((x+r)>=x1 && (y+r)>y1)) || ((x+r)>x1 && (y+r)>=y1)){
            System.out.println("Inside Circle");
        }else if((x+r)==x1 && (y+r)==y1){
            System.out.println("In Circle.");
        }else{
            System.out.println("Outside Circle.");
        }
        sc.close();
    }    
}
