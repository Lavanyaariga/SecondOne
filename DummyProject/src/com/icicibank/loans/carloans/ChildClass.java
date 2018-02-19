package com.icicibank.loans.carloans;

public class ChildClass extends ClasAbstarct
{

	public static void main(String[] args) 
	{
		ChildClass c=new ChildClass();
		c.m1();
		c.m2();
		
	}

	@Override
	public void m2() 
	{
		System.out.println("Hi aim me overridden method in child class");
	}

}
