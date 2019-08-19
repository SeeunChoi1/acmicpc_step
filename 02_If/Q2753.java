import java.util.Scanner;

class Q2753{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
        stdIn.close();

        if(A%4 == 0 && A%100 != 0)
            System.out.println("1");
        else if(A%400 ==0)
            System.out.println("1");
        else
            System.out.println("0");
    }
}