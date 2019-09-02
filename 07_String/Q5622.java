import java.util.*;

class Q5622{
    static int Dial(char c){
        switch(c){
            case 'A': case 'B': case 'C': 
                return 2;
            case 'D': case 'E': case'F': 
                return 3;
            case 'G': case 'H': case'I': 
                return 4;
            case 'J': case 'K': case'L': 
                return 5;
            case 'M': case 'N': case'O': 
                return 6;
            case 'P': case 'Q': case'R': case 'S': 
                return 7;
            case 'T': case 'U': case'V': 
                return 8;
            case 'W': case 'X': case'Y': case 'Z': 
                return 9;
            default: 
                return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;

        for(int i = 0; i<s.length(); i++){
            int time = Dial(s.charAt(i));
            sum += time + 1;
            System.out.println(time);
        }

        System.out.println(sum);
 
        sc.close();
    }
}   