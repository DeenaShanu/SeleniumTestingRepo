package testNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNGTwo {
	
  @Test
  public void sample1() {
	  System.out.println("SAMPLE*****");
  }
  @Test
  public void sample2() {
	  System.out.println("SAMPLE  2*****");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BEFORE METHOD-------");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AFTER METHOD-------");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BEFORE CLASS-------");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AFTER CLASS-------");
  }

}
