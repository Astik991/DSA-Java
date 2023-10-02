import java.util.*;
public class profitLossCheck {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Cost Price : ");
        int cp=sc.nextInt();
        System.out.println("Enter the Selling Price : ");
        int sp=sc.nextInt();
        int result;
        if(cp<sp){
            result=sp-cp;
            System.out.println("Profit: "+result);
        }
        else if(sp<cp){
            result=cp-sp;
            System.out.println("Loss: "+result);
        }else{
            System.out.println("No Profit or Loss.");
        }
        sc.close();
    }
}