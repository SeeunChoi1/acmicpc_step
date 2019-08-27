import java.util.*;

public class Q11021{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        for(int i = 1; i<=n; i++){
            if(a>0 && b<10){
                System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, a+b);            
            }
        }
        sc.close();        
    }
}