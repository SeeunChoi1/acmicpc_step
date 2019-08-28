import java.util.*;
import java.io.*;

public class Q8935{
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int sum = 0;

        for(int i = 0; i<n; i++){            
            String s = br.readLine();
            //bw.write("s : " + s+"\n");
            for(int j = 0; j<s.length(); j++){
                //bw.write("< charAt(" + j + "): " + s.charAt(j) + " >");
                if(s.charAt(j) == 'O'){
                    cnt += 1;
                    sum += cnt;
                }
                else if(s.charAt(j) == 'X'){
                    cnt = 0;
                }
                //bw.write("\ncnt of " +j+ " : "+ Integer.valueOf(cnt) + "\n");
                //bw.write("sum of " +j+ " : "+ Integer.valueOf(sum) + "\n");
            }
            //bw.write("\ncnt " + Integer.valueOf(cnt) + "\n");
            bw.write(Integer.valueOf(sum) + "\n");
            cnt = 0;
            sum = 0;
        }   

        bw.flush();
        br.close();
        bw.close();
    }
}