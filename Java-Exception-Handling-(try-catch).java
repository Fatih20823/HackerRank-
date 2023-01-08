import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        try {
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            int result = x/y;
            System.out.println(result);
            scan.close();
        }catch (InputMismatchException e){         
            System.out.println("java.util.InputMismatchException"); 
        }catch (ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        
    }
}
