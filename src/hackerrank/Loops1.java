package hackerrank;

import java.util.Scanner;

public class Loops1 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int r=0;
        for(int i=1;i<=10;i++){
           r=(N*i);
            System.out.println(N+ " x " +i+ " = "+r);
            in.close();
        }
    }

}
