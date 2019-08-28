import java.util.*;

public class Q1546{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int m = arr[n-1];

        for(int i = 0; i<n; i++){
            sum += arr[i];
        }

        double ave = ((double)sum*100)/((double)n*(double)m); 
        //System.out.println(m);  
        //System.out.println(sum);
        System.out.println(ave);          

        sc.close();
    }
}