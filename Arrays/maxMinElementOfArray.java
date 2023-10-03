import java.util.Scanner;

public class maxMinElementOfArray {
    void maxMin(int arr[],int size){
        int max=arr[0],min=arr[0];
        for(int i = 0; i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The maximum element of array is: "+max);
        System.out.println("The minimum element of array is: "+min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
        int arr[]= new int[size];
        for(int i = 0;i<size;i++){
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
        maxMinElementOfArray mt = new maxMinElementOfArray();
        mt.maxMin(arr,size);
        sc.close();
    }    
}
