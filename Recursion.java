package Java_Core;

public class Recursion {
    public static int Fibo(int n){

        if(n<2)
            return 1;

        return Fibo(n-1) + Fibo(n-2);

    }
    public static void main(String[] args) {
        System.out.println(Fibo(5));
    }
    
}
