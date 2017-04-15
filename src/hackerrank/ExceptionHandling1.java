package hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1 {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int d = x/y;
        System.out.println(d);
        }
        catch(InputMismatchException ime) {
        System.out.println(ime.getClass().getName());
        } catch (ArithmeticException ae) {
        System.out.println(ae.toString());
        } catch (Exception e) {
        System.out.println(e.toString());
        }
    }

}
