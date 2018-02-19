package com.icicibank.loans.carloans;

public class ABC 
{
	
	byte b=127;
	short s=32767;
	static ABC a;
	int x=10;
	static String cname = "prolifics";
	long l =23233;
	float f=10.32F;
	double d=23.45D;
	boolean b1=true;
	char ch='a';
	String str="ravilella";
	
	public void m1()
	{
		int x=20;
		System.out.println(x);	
	}
	
	public static void m2()
	{
		
		a=new ABC();
		a.m1();
		int x=20;
		System.out.println(x);	
	}
	
	public static void main(String[] args) 
	{
		a=new ABC();
		a.m1();
	}

	

}
