package com.icicibank.loans.eduloans;

public class Common 
{
	static RBI i;
	
	public static void main(String[] args) 
	{
		i=new ICICI();
		i.withdrawl();
		
		i=new HDFC();
		i.withdrawl();
		
		i=new Axis();
		i.withdrawl();

	}

}
