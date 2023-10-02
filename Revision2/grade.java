import java.util.Scanner;

public class grade {
    static void percentage(int maths,int science,int english,int sanskrit,int hindi,int sst){
        int percentage = (maths+science+english+sanskrit+hindi+sst)/6;
        System.out.println("Percentage is: "+percentage+"%");
        if(percentage>90){
            System.out.println("Excellent");
        }else if(percentage<=90&&percentage>80){
            System.out.println("Very Good");
        }else if(percentage<=80&&percentage>70){
            System.out.println("Good");
        }else if(percentage<=70&&percentage>60){
            System.out.println("Can Do Better");
        }else if(percentage<=60&&percentage>50){
            System.out.println("Average");
        }else if(percentage<=50&&percentage>40){
            System.out.println("Below Average");
        }else{
            System.out.println("Fail");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Maths Marks: ");
        int maths = sc.nextInt();
        System.out.println("Enter Science Marks: ");
        int science = sc.nextInt();
        System.out.println("Enter English Marks: ");
        int english = sc.nextInt();
        System.out.println("Enter Sanskrit Marks: ");
        int sanskrit = sc.nextInt();
        System.out.println("Enter Hindi Marks: ");
        int hindi = sc.nextInt();
        System.out.println("Enter Social Science Marks: ");
        int sst = sc.nextInt();
        if(maths<=100 && science<=100 && english<=100 && sanskrit<=100 && hindi<=100 && sst<=100){
            percentage(maths,science,english,sanskrit,hindi,sst);
        }else{
            System.out.println("Please enter Marks between 1-100");
        }
        sc.close();
    }    
}
