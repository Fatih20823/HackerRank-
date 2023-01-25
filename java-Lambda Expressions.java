import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
 public PerformOperation isOdd() {
    PerformOperation p = (int a) -> a%2==1 ? true : false; return p;
        
}

 public PerformOperation isPrime() {
    PerformOperation p = (int a) -> {
        if(a==2){
            return true;
        }else if (a%2==1 && a<=7){
            return true;
        }else if (a%2==1 && a>10 && a%3!=0 && a%5!=0 && a%7!=0){
            return true;
        }else{
            return false;
        }
    };
    return p;    
}
 public PerformOperation isPalindrome() {
    PerformOperation p = (int a) -> {
        String str,b="";
        str = Integer.toString(a);
        for(int i = str.length()-1;i>=0;i--){
            b = b+str.charAt(i);        
        }
        if(str.equals(b)){
            return true;
        }else {
            return false;
        }
    };
    return p;
 }
public static boolean isPalindrome(int a){
    String str,b;
    str = Integer.toString(a);
    for(int i = str.length()-1;i>=0;i++){
        b = str.charAt(i)+"";        
    }
    if(str.equals("b")){
        return true;
    }else {
        return false;
    }
}
  
}
public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
