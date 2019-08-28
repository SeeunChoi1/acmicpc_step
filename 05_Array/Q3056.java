import java.util.*;

public class Q3056{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[42];
        int cnt = 0;

        for(int i = 0; i<10; i++){
            int n = sc.nextInt();
            if( !arr[n%42] ){
                arr[n%42] = true;
                cnt++;
            }
        }    
        
        System.out.println(cnt);        

        sc.close();
    }
}