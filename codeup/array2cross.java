import java.util.*;

class array2cross{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int[][] arr = new int[19][19];

        for(int i = 0; i<19; i++){ //how many ball
           for(int j = 0; j<19; j++){
               arr[i][j] = sc.nextInt();
           }
        }

        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int stdX = sc.nextInt()-1;
            int stdY = sc.nextInt()-1;
            // System.out.printf("(%d , %d)", stdX+1, stdY+1);
            // System.out.print(arr[0][stdY]);
            // System.out.println();

            for(int x= 0; x<19; x++){
                if(arr[x][stdY] == 1) arr[x][stdY] = 0;
                else if(arr[x][stdY] == 0) arr[x][stdY] = 1;                    
            }
            for(int y= 0; y<19; y++){
                if(arr[stdX][y] == 1) arr[stdX][y] = 0;
                else if(arr[stdX][y] == 0) arr[stdX][y] = 1;                    
            }
            
        }

        //System.out.println();

        for(int i = 0; i<19; i++){
            for(int j = 0; j<19; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();        
    }
}