import java.util.*;

class Q1316{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int cnt = 0;    
        int sum = 0;  

        for(int i = 0; i<n; i++){

            boolean[] flag = new boolean[26];
            int[] arr = new int[26];
            String s = sc.next();

            for(int j = 0; j<s.length(); j++){
               int idx = s.charAt(j)-97;
               arr[idx]++;
               flag[idx] = true;
                if(j+1<s.length()){
                   if(s.charAt(j) != s.charAt(j+1)){
                       if(flag[j]) cnt ++;
                    }  
                }
            }

            if(cnt>0){
                sum ++;
            }
            cnt = 0;

            ///////
            for(int j = 0; j<26; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
            System.out.println(sum);
            ///////
        }
        System.out.println(n-sum);

        sc.close();
    }
}