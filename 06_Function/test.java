import java.util.*;

class test{
    public static void main(String[] args){
        int[] arr = new int[4];
        int digit = 1;
        int num = 120;

        for(int i = 0; i<4; i++){            
            int a = num%10;            
            arr[i] = a;
            num = (num-a)/10;
            if(num>0) digit++;                            
        }

        for(int i = 0; i<4; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(digit);      
    }
}