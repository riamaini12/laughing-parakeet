package hackerrank;

import java.util.Scanner;

public class Loops2 {
	public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double s=0;
            double result=0;
            double bt=(a+(Math.pow(2,0))*b);
            for(int j=1;j<n+1;j++){
            
                result=bt+s;
                System.out.print((int)result);
                System.out.print(" ");
                s=Math.pow(2,j)*b;
                bt=result;
                
                
            }
          System.out.println();
      
        }
        in.close();
       
    }

}
