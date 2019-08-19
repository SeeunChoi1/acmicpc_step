import java.util.*;

class Q10817{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
        int B = stdIn.nextInt();
        int C = stdIn.nextInt();
        stdIn.close();

        if(A>B && B>C) System.out.println(B);
        else if(C>=B && B>=A) System.out.println(B);
        else if(B>=A && A>=C) System.out.println(A);
        else if(C>=A && A>=B) System.out.println(A);
        else if(B>=C && C>=A) System.out.println(C);
        else if(A>=C && C>=B) System.out.println(C);

        int[] a = {A, B, C};
        Arrays.sort(a);
        System.out.println(a[1]);
    }
}