import java.io.*;
import java.util.*;

public class Q11729{
    public static void hanoi(int n, int x, int y, int z) throws java.io.IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        if(n==0) return;
        hanoi(n-1, x, y, z);
        bw.write(x + " " + y+"\n");
        hanoi(n-1, z, x, y);

        bw.flush();
    }

    public static void main(String[] args) throws java.io.IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        System.out.println((int)(Math.pow(2, n)-1));
        hanoi(n, 1, 2, 3);
          
        br.close();
        bw.close();
    }
}