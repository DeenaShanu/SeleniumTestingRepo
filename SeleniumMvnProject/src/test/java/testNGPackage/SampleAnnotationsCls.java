package testNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SampleAnnotationsCls {
	
  @Test
  public void dis1() {
	  System.out.println("DIS 1*********");
  }
  
  @Test
  public void dis2() {
	  System.out.println("DIS 2*********");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod *********");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod *********");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass *********");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass *********");
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest *********");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest *********");
  }

}
