import java.util.*;

public class Q1065{
    static boolean hNum(int num){
        int[] arr = new int[3];

        for(int i = 0; i<3; i++){            
            int a = num%10;            
            arr[i] = a;
            num = (num-a)/10;                         
        }
        
        if((arr[0]-arr[1]) == (arr[1]-arr[2])) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //int num = 210;
        int cnt = 0;

        if(0<num && num<10) cnt = num;
        else if(10<=num && num<100) cnt = num;
        else if(100<=num && num<1000){
            for(int i = 100; i<=num; i++){
                if(hNum(i)) cnt++;                
            }
            cnt += 99;
        }
        else{
            cnt = 144;
        }

        System.out.println(cnt);
        sc.close();
    }
}