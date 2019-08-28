import java.util.*;

public class Q4344{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();  
        int[] arr = new int[1000];      
        int score, sum = 0;
        
        for(int i =0 ; i<c; i++){
            int n = sc.nextInt();            
            for(int j = 0; j<n; j++){                
                score = sc.nextInt();
                arr[j] = score;
                sum += score;
            }
            double ave = sum/n;
            int cnt = 0;
            for(int j = 0; j<n; j++){
                if(arr[j]>ave){
                    cnt += 1;                    
                }
            }
            
            System.out.printf("%.3f", cnt*100.0/n);
            System.out.print("%\n");

            score = 0;
            sum = 0;
        }
        sc.close();
    }
}