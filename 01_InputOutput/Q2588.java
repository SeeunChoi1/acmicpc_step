import java.util.Scanner;

class Q2588{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
        int B = stdIn.nextInt();

        stdIn.close();     
        System.out.println(A*(B%10));
        System.out.println(A*((B%100-B%10)/10));
        System.out.println(A*(B/100));
        System.out.println(A*B);
    }
}
