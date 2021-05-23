package testcases;

import org.openqa.selenium.By;

import com.zenq.baseclas.BaseClass;

public class TC_001 extends BaseClass {
	

	public static void main(String[] args) {
		
		
		setup();
		
		//driver.findElement(By.linkText("$ US Dollar")).click();
		driver.findElement(By.xpath("//span[text()='Currency']/li")).click();
		

		
	}

}
