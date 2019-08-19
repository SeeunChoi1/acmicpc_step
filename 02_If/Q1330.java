import java.util.Scanner;

class Q1330{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
        int B = stdIn.nextInt();
        stdIn.close();
        
        if(A>B) System.out.println(">");
        else if(A<B) System.out.println("<");
        else System.out.println("==");

    }
}