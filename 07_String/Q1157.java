import java.util.*;

class Q1157{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        String s = sc.nextLine();
        //System.out.println(s);  

        for(int i = 0; i<s.length(); i++){
            int aski = s.charAt(i);
            if(65<=aski && aski<=90) aski -= 65;
            else aski -= 97;
            arr[aski] += 1;            
        }   

        for(int i = 65; i<91; i++){
            System.out.print(Character.toString ((char) i) + " ");
        }
        System.out.println();

        for(int i = 0; i<26; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int max = 0;
        int idx = 0;
        for(int i = 0; i<26; i++){
            if(arr[i]>max) {
                max = arr[i];
                idx = i;
            }
        }

        Arrays.sort(arr);
        if(arr[25] == arr[24]) System.out.println("?");
        else System.out.println(Character.toString( (char)(idx+65) ));


        sc.close();
    }
}   