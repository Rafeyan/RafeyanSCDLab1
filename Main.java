import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		int a,b,c;
		Scanner input = new Scanner(System.in);
		try{
			System.out.println("Enter 1st number: ");
			a = input.nextInt();
			System.out.println("Enter 2nd number: ");
			b = input.nextInt();
			c = a/b;
			System.out.println("Answer: " + c);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception occurred");
		}
		catch(InputMismatchException e){
			System.out.println("Invalid input");
		}
		catch(Exception e){
			System.out.println("Generic exception occurred: " + e);
		}
	}
}

//FOR V2 I've Just DOing this comment Haha :)
