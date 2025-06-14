package testNGPackage;


import org.testng.annotations.Test;

public class TestNGClass {
	

	
  @Test(priority = 1)
  public void test() {

	  System.out.println("TestNG.....");
  }
  @Test(priority = 2)
  public void sample() {
	  System.out.println("Welcome*****");
  }
}
