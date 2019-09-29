import java.util.*;

class array1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];

        for(int i = 0; i<n; i++){
            list[i] = sc.nextInt();
        }
        int min = list[0];
        
        for(int i = 0; i<n; i++){
            if(list[i]<min) min = list[i];
        }

        for(int i = 0; i<n; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.print(min);

        sc.close();        
    }
}