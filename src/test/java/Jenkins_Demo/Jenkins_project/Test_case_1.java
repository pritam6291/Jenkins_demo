package Jenkins_Demo.Jenkins_project;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.BasePage;

public class Test_case_1 extends BasePage{
	
	@Test
	public void test1() {
		 String actual_title=driver.getTitle();
		 String expected_title="Facebook – log in or sign up";
		 Assert.assertEquals(expected_title, actual_title);
		 System.out.println(actual_title);
		
		}
	@Test
	public void test2() throws InterruptedException {
		 driver.findElement(By.id("email")).sendKeys("fhjdhfd");;
		 Thread.sleep(2000);
		 driver.findElement(By.id("pass")).sendKeys("fhjdhfd");
		 Thread.sleep(2000);
		 driver.findElement(By.name("login")).click();
		 
		
		}
	

}
