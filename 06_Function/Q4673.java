import java.util.*;

public class Q4673{
    static int d(int num){
        int sum = 0;
        int[] arr = new int[6];
        arr[0] = num;
        while(num>0){
            for(int i = 1; i<6; i++){
                int a = num%10;
                num = (num-a)/10;
                arr[i] = a;
            }
        }

        for(int i = 0; i<6; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        boolean[] chart = new boolean[10001];
        for(int num = 1; num<=10001; num++){
            if(d(num)<=10000){
                chart[d(num)] = true;
            }
        }
        for(int num = 1; num<10001; num++){
            if(chart[num] == false) System.out.println(num);
        }
    }
}