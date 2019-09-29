import java.util.*;

class kakao1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] arr = new String[s.length()];
        String ans = "";
        int cnt = 1;

        for(int j = s.length()/2; j>0; j--){
            System.out.println("j = " + j);

            for(int i = 0; i<s.length(); i+=j){
                // System.out.println(i + " " + (i+j));
                arr[i] = s.substring(i, i+j); // 0, 3 // 4, 5// 5, 9
                System.out.print(arr[i] + " ");
            }
    
            for(int i =0; i<s.length()/j; i++){
                if(i<s.length()/j-1){
                    if(arr[i].equals(arr[i+1])){
                        cnt++;
                    }
                    else ans += arr[i];
                }
                else {
                    
                    ans += cnt;
                    ans += arr[i];
                    cnt = 1;
                }
                
            }
            System.out.println();
    
            System.out.println("ans : " + ans);
            int answer = ans.length();
            System.out.println(answer);

            ans = "";
            answer = 0;
            cnt = 1;
        }
        

        sc.close();
    }
}