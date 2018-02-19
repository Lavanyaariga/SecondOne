package com.icicibank.loans.carloans;

public class BasicClass implements BasicInteface
{
	int a=10;
	
	public void m1()
	{
		System.out.println("Hi iam m1 method...");
	}
	

	public static void main(String[] args) 
	{
		BasicClass obj=new BasicClass();
		obj.m1();
		System.out.println(obj.a);
		obj.add();

	}

	@Override
	public void add() 
	{
		System.out.println("Hi iam overridden ad method in Basicclass...");
	}

}
