import java.util.*;

class Q2908{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); 

        int c = (a%10)*100 + (a%100-a%10) + (a/100);
        int d = (b%10)*100 + (b%100-b%10) + (b/100);

        if(c>d){
            System.out.println(c);
        }else System.out.println(d);       
        sc.close();
    }
}   