import java.util.*;

public class Q1110{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tens, ones, cnt = 0;
        int initN = n;

        do{
            if(n<10){
                tens = 0;
                ones = n;
            }else{
                tens = n/10;
                ones = n%10;
            }
            n = ones*10 + (tens+ones)%10;
            //System.out.println(n);
            cnt += 1;                       
        }while( initN != n );
        System.out.println(cnt);
        sc.close();
    }
}