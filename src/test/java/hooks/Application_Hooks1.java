package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Application_Hooks1 
{
//	@BeforeStep(order=2)
//	public void beforeHookSteps()
//	{
//		System.out.println("Before hook step is executing");
//	}
//	
//	@BeforeStep(order=1)
//	public void beforeHookSteps1()
//	{
//		System.out.println("Before hook step1 is executing");
//	}
//	
	@After("@sanity")
	public void xyz()
	{
		System.out.println("After hook2 is executing");
	}
//	
	@After(order=2)
	public void ghk()
	{
		System.out.println("After hook1 is executing");
	}
	
	@Before()
	public void def()
	{
		System.out.println("Before hook2 is executing");
	}
	
//	@Before(order=1)
//	public void abc()
//	{
//		System.out.println("Before hook1 is executing");
//	}
	
//	@AfterStep(order=2)
//	public void afterHookSteps()
//	{
//		System.out.println("after hook step is executing");
//	}
//	
//	@AfterStep(order=1)
//	public void afterHookSteps1()
//	{
//		System.out.println("after hook step1 is executing");
//	}
	
	

}
