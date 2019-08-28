import java.util.*;

public class Q15596{
    static long sum(int[] a){
        long result = 0;

        for(int i = 0; i<a.length; i++){
            result += a[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println(sum(a));

        sc.close();        
    }
}