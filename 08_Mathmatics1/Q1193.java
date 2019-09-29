import java.util.*;

class Q1193{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int endnum = 0;
        int cnt = 1;

        while(true){
            if(n<=endnum){
                break;
            }  
            endnum += cnt;
            cnt++;
        }  

        if((cnt-1)%2 == 1) System.out.println("oddnum : " + (cnt-(n-(endnum-cnt+2)+1)) + "/" + (n-(endnum-cnt+2)+1) );
        else System.out.println("evennum : " + (n-(endnum-cnt+2)+1) + "/" + (cnt-(n-(endnum-cnt+2)+1)) );

        System.out.println(endnum-cnt+2);
        System.out.println(endnum); 
        System.out.println(cnt-1);
        sc.close();  

    }
}