import java.util.*;

public class Q10871{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];
        int X = sc.nextInt();
        
        if(1<=N && X<=10000){
            for(int i = 0; i<N; i++){
                list[i] = sc.nextInt();
            }
            for(int j = 0; j<N; j++){
                if(list[j] < X){
                    System.out.print(list[j] + " ");
                }            
            }
        }
        sc.close();        
    }
}