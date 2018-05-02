package oop;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int count = input.nextInt();
		int n1 = 0 ,n2 = 1;
		
		System.out.print(n1 + " ");
		System.out.print(n2 + " ");
		
		for(int x = 2; x < count; x++)
		{
			
			int n3 = n1 + n2;
			System.out.print(n3 + " ");
			
			n1 = n2;
			n2 = n3;
		}
	}

}
