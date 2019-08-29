import java.io.*;

class Q11720{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String num  = br.readLine();
        int sum = 0;

        bw.write("n is " + n+"\n");
        for(int i = 0; i<n; i++){
            int temp = Integer.parseInt(String.valueOf(num.charAt(i)));
            bw.write(temp+"\n");
            sum += temp;
        }
        bw.write("sum is " + sum +"\n");

        bw.flush(); 
        br.close();
        bw.close();      
    }
}