import java.util.*;

class Q2675{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n; i++){
            int cnt = sc.nextInt();
            String s = sc.nextLine();

            String result = "";
            for(int j=0; j<s.length();j++){
                for(int k = 0; k<cnt; k++){
                    result += s.charAt(j);
                }
            }
            result = result.replaceAll(" ", "");
            System.out.println(result);
        }
        sc.close();
    }
}