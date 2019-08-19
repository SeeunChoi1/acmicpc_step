import java.util.*;

public class Q10950{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n*2];

        for(int i = 0; i<n*2; i++){
            a[i] = sc.nextInt();
        }
        
        for(int j = 0; j<n*2; j += 2){
            System.out.println(a[j]+a[j+1]);
        }
        sc.close();
    }
}