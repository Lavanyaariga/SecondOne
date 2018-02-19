package com.icicibank.loans.carloans;

class C extends B 
{
	
	public Object m1(int a,int b)
	{
		System.out.println("Hi iam m1 method..."+ a);
		return b;
	}

	public void m2()
	{
		System.out.println("Hi iam m2 method...");
	}
	
	public static void main(String[] args) 
	{
		C c=new C();
				
	}

	@Override
	public void m7() {
		// TODO Auto-generated method stub
		
	}

}
