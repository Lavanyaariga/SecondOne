package com.icicibank.loans.carloans;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BasicDependent {
  @Test(priority=0)
  public void f() 
  {
	  System.out.println("f");
  }
  
  @Test(priority=1)
  public void a() 
  {
	  System.out.println("a");
  }
  
  
  @Test(priority=2)
  public void r() 
  {
	  System.out.println("r");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("afterMethod");
  }

}
