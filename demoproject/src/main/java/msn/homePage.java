package msn;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import webGeneric.LocationStrategy;
import webGeneric.ReusableMethods;

public class homePage extends LocationStrategy {

	/*
	*Aim: Scroll Down the window and click on a footer and scroll up to the top
	*/
	public void footerLinkClick(WebDriver driver) throws InterruptedException {
		ScrollToBottom(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/* ***********Right click on a link and open in new tab & take the control back to main tab********************** 
		 * String oldTab = driver.getWindowHandle(); String link1 =
		 * Keys.chord(Keys.CONTROL,Keys.ENTER);
		 * driver.findElement(By.linkText("Terms of use")).sendKeys(link1);
		 * 
		 * ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		 * driver.switchTo().window(newTab.get(0)); Thread.sleep(5000);
		 * driver.switchTo().window(oldTab); Thread.sleep(5000);
		 */
		driver.findElement(By.linkText("Terms of use")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		ScrollToTop(driver);
	}

	public void clickTravel(WebDriver driver) {
		
		driver.findElement(By.linkText("TRAVEL")).click();
		System.out.println(driver.getTitle());
		

	}
	
	public void clickLifestyle(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(@href, 'lifestyle')] [contains(@data-m,'lifestyle')]")).click();
		Thread.sleep(3000);
		
	}
	
	public void clickLink(String identifier, WebDriver driver)
	{
	//driver.findElement(By.xpath("//a[contains(@href, 'weather')]")).click();
	locateLink(identifier, driver).click();
	}
	// driver.get("https://www.msn.com/en-in");

}
