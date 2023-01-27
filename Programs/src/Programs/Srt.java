package Programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Srt {


@Test
public void test()
{

	System.out.println("             "+"this is test"+"            ");
}
@BeforeTest

public void test2()
{
	System.out.println("this is Before Testtest2");
}
@AfterClass

public void class2()
{
	System.out.println("this is Before Class1");
}
@BeforeClass

public void class1()
{
	System.out.println("this is Before Class1");
}

@AfterMethod

public void method1()
{
	System.out.println("this is After Method");
}

@BeforeSuite
public void method3()
{
	System.out.println("this is Before Suite");
}
@AfterSuite
public void method4()
{
	System.out.println("this is After suite");
}


@BeforeMethod
public void method()
{
	System.out.println("this is Before Method");
}

@AfterTest
public void test3()
{
	System.out.println("this is After  test3");
}

}
