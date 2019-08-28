import java.io.*;

public class test2{
    public static BufferedReader br;
    public static BufferedWriter bw;

    public static void hanoi(int n, int x, int y) throws java.io.IOException {
        if(n==0) return;
        hanoi(n-1, x, 6-x-y);
        bw.write(x + " " + y+"\n");
        hanoi(n-2, 6-x-y, y);      
    }

    public static void main(String[] args) throws java.io.IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = br.read();
        int count = (int) Math.pow(2, num) - 1;
        
        System.out.println(count);
        hanoi(num, 1, 3);

        bw.flush();  
        br.close();
        bw.close();
    }
}