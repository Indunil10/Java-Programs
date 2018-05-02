package oop;
import java.util.*;

public class Armstronge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n = input.nextInt();
		
		int t = n,c = 0;
		
		while(t > 0)
		{ 
			int a = t % 10;
			c = c + (a * a * a);
			t = t / 10;
		}
		if(c == n)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
				

	}

}
