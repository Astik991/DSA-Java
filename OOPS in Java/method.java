// Non Static Method
public class method {
    void exampleMethod(){
        int n = 10;
        System.out.println(n);
    }
    public static void main(String[] args) {
        method mt = new method();
        mt.exampleMethod();
    }    
}
