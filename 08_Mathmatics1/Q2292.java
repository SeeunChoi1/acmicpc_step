import java.util.*;

class Q2292{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int addnum = 6;
        int endnum = 1;
        int cnt = 1;

        while(true){      
            if(n<=endnum){
                break;
            }       
            endnum += addnum;
            addnum += 6;
            cnt++;           
        }  

        System.out.println(endnum); 
        System.out.println(cnt);
        sc.close();  

    }
}