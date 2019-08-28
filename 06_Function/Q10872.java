import java.util.*;

public class Q10872{
    static int factorial(int n){
        if(n>1) return n*(factorial(n-1));
        else return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
}