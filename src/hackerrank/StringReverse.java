package hackerrank;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        String str=sc.next();
    String rev = new StringBuffer(str).reverse().toString();
    if(str.equals(rev)){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
        
 }

}
