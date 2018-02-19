package com.icicibank.loans.eduloans;

public class ICICI implements RBI
{
	static RBI i;
	
	public static void main(String[] args) 
	{
		//ICICI i=new ICICI();
		//i.withdrawl();
		i=new ICICI();
		i.withdrawl();
		
		i=new HDFC();
		i.withdrawl();
		
		i=new Axis();
		i.withdrawl();
		
	}

	@Override
	public void withdrawl() 
	{
		System.out.println("HI iam implemented withdrawl method in class ICICI");		
	}

}
