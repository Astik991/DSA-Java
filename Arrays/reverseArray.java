import java.util.Scanner;

public class reverseArray {
    void reverse(int arr[],int size){
        int[] rev = new int[size];
        int revSize = size;
        String ans = "";
        // size--;
        for(int i=0;i<revSize;i++){
            rev[i]=arr[size-1];
            size--;
        }
        for(int i = 0;i<revSize;i++){
            ans +=rev[i]+" ";
        }
        System.out.print("The reversed array is: "+ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i=0;i<size;i++){
            if(i==0){
                System.out.print("Enter "+i+"th element: ");
                arr[i]=sc.nextInt();
            }else if(i==1){
                System.out.print("Enter "+i+"st element: ");
                arr[i]=sc.nextInt();
            }else if(i==2){
                System.out.print("Enter "+i+"nd element: ");
                arr[i]=sc.nextInt();
            }else if(i==3){
                System.out.print("Enter "+i+"rd element: ");
                arr[i]=sc.nextInt();
            }else{
                System.out.print("Enter "+i+"th element: ");
                arr[i]=sc.nextInt();
            }
        }
        reverseArray mt = new reverseArray();
        mt.reverse(arr,size);
        sc.close();
    }
}
