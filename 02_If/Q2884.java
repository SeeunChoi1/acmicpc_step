import java.util.Scanner;

class Q2884{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int H = stdIn.nextInt();
        int M = stdIn.nextInt();
        stdIn.close();

        if(M>45) System.out.println(H + " " + (M-45));
        else if(H-1<0) System.out.println(H-1+24 + " " + (M+60-45));
        else System.out.println(H-1 + " " + (M+60-45));
    }
}