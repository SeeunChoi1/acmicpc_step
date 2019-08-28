import java.util.*;

public class Q2447{
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);        
        int n = 27;

        // System.out.print(" ");
        // for(int x=0; x<n; x++){
        //     System.out.print(x);
        // }
        // System.out.print("\n");

        for(int y = 0; y<n; y++){
            //System.out.print(y);            
            for(int x = 0; x<n; x++){
                if((y/9) == 1 && 0<(y%9) && (y%9)<9) {
                    if((x/9) == 1 && 0<(x%9) && (x%9)<9) System.out.print(" "); 
                    else if(2<(y%9) && (y%9)<=5){
                        if(y%3 == 1){                    
                            if(x%3 == 1) System.out.print(" ");
                            else if(2<x && x<=5) System.out.print(" ");
                            else System.out.print("*");                   
                        }                  
                        else if(2<(x%9) && (x%9)<=5) System.out.print(" ");
                        else System.out.print("*");                    
                    }
                    else System.out.print("*"); 
                }
                //hole in the middle
                else if(2<(y%9) && (y%9)<=5){
                    if(y%3 == 1){                    
                        if(x%3 == 1) System.out.print(" ");
                        else if(2<x && x<=5) System.out.print(" ");
                        else System.out.print("*");                   
                    }                  
                    else if(2<(x%9) && (x%9)<=5) System.out.print(" ");
                    else System.out.print("*");                    
                }
                else if(y%3 == 1){                    
                    if(x%3 == 1) System.out.print(" "); 
                    else System.out.print("*");                   
                }
                else System.out.print("*");        
            }
            System.out.print("\n");
        }
        //sc.close();
    }
}