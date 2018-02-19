package com.icicibank.loans.carloans;

public class BasicChild extends BasicAbstract
{
	int a=10;
	
	public  void m5()
	{
		System.out.println("hi iam m5...");
	}

	public static void main(String[] args) 
	{
		BasicChild b=new BasicChild();
		b.m1();
		b.m2();
		b.m5();
	}

	@Override
	public void m2() 
	{
		System.out.println("Hi iam overidden method in BasicChild..");
	}
	
}
