import java.util.Scanner;

class Main{

    public static void Merge(int[] a, int right, int left, int n){
        //while(c>0){
            int c = n+1/2;
            int[] x = new int[c];

            for(int i=0; i<c; i++){
                x[i] = a[i+c];
            }
    
            for(int i=0; i<=c; i++){
                for(int j = c+1; j<n; j++){
                    if(a[i]>=x[j] && i<j){
                        a[i+1] = a[i];
                        a[i] = x[i];
                    }
                    else{
                        a[i+1] = x[j];                   
                    }
                }
            }
        
        //}

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int nv = stdIn.nextInt();
        int[] x = new int[nv];

        for(int i=0; i<nv; i++){
            x[i] = stdIn.nextInt();
        }

        Merge(x, 0, nv-1, nv);
        
        for(int i=0; i<nv; i++){
            System.out.println(x[i]);
        }

        stdIn.close();   
    }
}