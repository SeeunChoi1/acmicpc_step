import java.util.Scanner;

class Main{
    public static void sorting(int[] a, int n){
        int tmp;
        for (int i=0; i<n-1; i++){
            for(int j = 0; j<n-1; j++){
                if(a[j]>a[j+1]) {
                    tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int nv = stdIn.nextInt();
        int[] x = new int[nv];

        for(int i=0; i<nv; i++){
            x[i] = stdIn.nextInt();
        }

        sorting(x, nv);
        
        for(int i=0; i<nv; i++){
            System.out.println(x[i]);
        }

        stdIn.close();
        
    }
}