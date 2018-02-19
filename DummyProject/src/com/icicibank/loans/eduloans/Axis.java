package com.icicibank.loans.eduloans;

public class Axis implements RBI
{

	public static void main(String[] args) 
	{
		Axis a=new Axis();
		a.withdrawl();
	}

	@Override
	public void withdrawl() 
	{
		System.out.println("HI iam implemented withdrawl method in class Axis");
	}

}
