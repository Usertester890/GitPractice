package webGeneric;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocationStrategy extends ReusableMethods{
	
	public WebElement locateLink(String identifier, WebDriver driver) {

		WebElement linkElement = null;
		String xpath1 = String.format("//a[contains(@href,'%s')]", identifier);
		// driver.findElement(By.xpath(xpath1));
		System.out.println(xpath1);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath1)));
		
		linkElement = driver.findElement(By.xpath(xpath1));
		System.out.println(linkElement);
		return linkElement;

	}
	
	public void locateLink() {
		
		driver.findElement(By.linkText("TRAVEL")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(@href, 'lifestyle')] [contains(@data-m,'lifestyle')]")).click();

	}
	
	/*
	 * Aim : Clicking on Down Arrow
	 * 
	 */
	public void keyboardDownArrow (WebDriver driver) {
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ARROW_DOWN).click().build().perform();
		a.sendKeys(Keys.ENTER).click().build().perform();
	}
	/*
	 * Aim : Explicit Wait
	 * 
	 */
	
	public void ExplicitWait() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mylocations']//a[contains(@href,'weather/places')]")));
	}
	
	

	/*
	 * Aim:- Javascript Executor
	 * */
	
	public void javaScriptClick (WebElement element) {
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("arguments[0].click();", element);
	}
	 
	
	
}
