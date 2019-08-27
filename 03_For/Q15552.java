import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.*;

public class Q15552{
    public static void main(String[] args) throws java.io.IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
       
        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            //int a = Integer.parseInt(st.split(" ")[0]); st = br.readLine();
            int b = Integer.parseInt(st.nextToken());
            bw.write(Integer.valueOf(a+b) + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}