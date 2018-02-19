package com.icicibank.loans.eduloans;

public class HDFC implements RBI
{

	public static void main(String[] args) 
	{
		HDFC h=new HDFC();
		h.withdrawl();

	}

	@Override
	public void withdrawl() 
	{
		System.out.println("HI iam implemented withdrawl method in class HDFC");		
	}

}
