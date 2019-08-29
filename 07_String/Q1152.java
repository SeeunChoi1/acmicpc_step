import java.util.*;

class Q1152{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim(); 
        String[] arr = s.split(" ");

        if(s.isEmpty()) System.out.println("0");
        else{
            for(int i = 0; i<arr.length; i++){
                System.out.println("arr[" + i + "] " +arr[i]);
            }   

            System.out.println(arr.length);
        }
       
        sc.close();
    }
}   