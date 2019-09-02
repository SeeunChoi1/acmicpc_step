import java.util.*;

class Q2941{    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        int sum = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'c' && s.length()>1){
                if(s.charAt(i+1) == '=' || s.charAt(i+1) == '-' && i<s.length()-1){
                    cnt = 0;
                }
                else cnt = 1;
            }
            else if(s.charAt(i) == 'd' && s.length()>1){
                if(i<s.length()-1){
                    if(s.charAt(i+1) == '-' ) cnt = 0;
                }
                else if(i<s.length()-2){
                    if(s.charAt(i+1) == 'z' && s.charAt(i+2) == '=') cnt = 0;
                }
                else cnt = 1;
            }
            else if(s.charAt(i) == 'l' && s.length()>1 && i<s.length()-1){
                if(s.charAt(i+1) == 'j'){
                    cnt = 0;               
                } 
                else cnt = 1;
            }
            else if(s.charAt(i) == 'n' && s.length()>1 && i<s.length()-1){
                if(s.charAt(i+1) == 'j') cnt = 0;
                else cnt = 1;
            }
            else if(s.charAt(i) == 's' && s.length()>1 && i<s.length()-1){
                if(s.charAt(i+1) == '=') cnt = 0;
                else cnt = 1;
            }
            else if(s.charAt(i) == 'z' && s.length()>1 && i<s.length()-1){
                if(s.charAt(i+1) == '=') cnt = 0;
                else cnt = 1;
            }
            else cnt = 1;

            sum += cnt;
            System.out.print(cnt + " ");
            cnt = 0;
        }

        System.out.println(sum);
 
        sc.close();
    }
}   