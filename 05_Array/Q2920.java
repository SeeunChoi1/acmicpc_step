import java.util.*;

public class Q2920{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int ans = 0;

        for(int i=0; i<8; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i<7; i++){
            if(arr[i]<=arr[i+1]) ans += 1;
            else if(arr[i]>=arr[i+1]) ans -= 1;
        }

        if(ans == 7) System.out.println("ascending");
        else if(ans == -7) System.out.println("descending");
        else System.out.println("mixed");

        sc.close();
    }
}