import java.io.*;

class Q10809{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int[] chart = new int[26];

        //bw.write("s is " + s +"\n");

        for(int i = 0; i<26; i++){
            chart[i] = -1;
        }

        for(int i = 0; i<s.length(); i++){
            //bw.write(s.charAt(i));
            int temp = s.charAt(i);
            if(chart[temp-97] == -1 ) chart[temp-97] = i;
            else chart[i] = chart[i];
        }

        for(int i = 0; i<26; i++){
            bw.write(chart[i]+" ");
        }

        bw.flush(); 
        br.close();
        bw.close();      
    }
}