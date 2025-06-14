package testNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNGSample {
  @Test
  public void print() {
	  System.out.println("Printing*********");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BEFORE METHOD*********");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AFTER METHOD **********");
	  
  }
  @Test
  public void display() {
	  System.out.println("DISPLAYING");
  }

}
