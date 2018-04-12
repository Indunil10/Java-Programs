package sntax;

import java.util.Scanner;

public class Welcome {

	public Welcome() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for(int x = 1;x<=10;x++)
        {
            System.out.println(n +"*"+ x +"="+ n*x);
        }
        
	}

}
