import java.util.*;

public class Q2577{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = a*b*c;
        int[] arr = new int[10];
        
        //System.out.println(a*b*c);

        while( n > 0){
            int digit = n%10;
            arr[digit] += 1;
            n = n/10;
        }

        for(int i = 0; i<10; i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}