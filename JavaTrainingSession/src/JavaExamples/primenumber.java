package JavaExamples;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		int number = 0,i;
		boolean flag = false;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		number=in.nextInt();
		System.out.println("The entered number is "+number);
		for(i=2;i<=number/2;i++) {
			
		if(number%i==0)
		{
			flag=false;
		}
		
		else
		{
			flag=true;
		}
		}
		if(flag==true)
		{
			System.out.println("Number is a prime number");
		}
		else {
			System.out.println("Number is not a prime number");
		}
	
		
		// TODO Auto-generated method stub

	}
}


