package oop;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n = input.nextInt();
		
		if(n < 0)
		{
			System.out.println("no no no");
		}
		else
		{
			int f = 1;
			for(int x = 1; x<= n;x++)
			{
				f = f * x;
			}
			
			System.out.println("Factorial of : "+ n + " is : " + f);
		}
		
	}

}
