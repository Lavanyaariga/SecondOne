package com.icicibank.loans.carloans;

import java.util.Scanner;

public  class BasicException 
{
	static int n,d,result;

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("Enter Numarator value :");
			n=s.nextInt();
			
			System.out.println("Enter Denominator value :");
			d=s.nextInt();
			
			try 
			{
				result=n/d;
				System.out.println(result);
				break;
			}
			catch(ArithmeticException a)
			{
				//a.printStackTrace();
				//System.out.println(a);
				System.out.println("Denominator value should be greater than zero..");
			}
		}
		
		
	}
}
