package msn;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webGeneric.LocationStrategy;

public class WeatherPage extends LocationStrategy {
	String location;
	String temperature;
	String currentLocation;

	public void getTempXXXX(WebDriver driver) {
		location = driver.findElement(By.xpath("//div[@class='mylocations']/div")).getText();
		System.out.println("Location is " + location);
		if (location.contains("Bengaluru")) {
			// temperature =
			// driver.findElement(By.xpath("//li[@data-aop='day1']/a/ul/li/p[1]")).getText();
			temperature = driver
					.findElement(By.xpath("//li[@data-aop='day1']//a[contains(@href,'weather')]/ul/li[1]/p[1]"))
					.getText();
			System.out.println("The weather at Bangaluru is " + temperature);
		}

	}

	public void getTempParameterised(WebDriver driver, String day, String location) throws InterruptedException {

		waitUntilElementClickable(driver, By.xpath("//div[@class='mylocations']/div"));
		  currentLocation = driver.findElement(By.xpath("//div[@class='mylocations']/div[1]/span")).getText();
		  System.out.println("Current location is " + currentLocation);
		  if (currentLocation.contains(location)) {
		  System.out.println("The temperature of " + location + " " + day + " is " + getTempOfDay(driver, day));
		  }
		 
		 else {
		
		// Clicking on Location Search box link
		By searchLocator = By.xpath("//div[@class='mylocations']/div[1]/span");
		WebElement element = driver.findElement(By.xpath("//div[@class='mylocations']/div[1]/span"));
		IsElementValid (driver,searchLocator);
		if (isElementPresent(driver, searchLocator))
		{
			System.out.println("Element search locator present is " + isElementPresent(driver, searchLocator));
			waitUntilElementClickable(driver, searchLocator);
			driver.findElement(searchLocator).click();
		}
		else
		{
		waitUntilElementClickable(driver, searchLocator);	
		System.out.println("Element search locator present is " + isElementPresent(driver, searchLocator));
			JavascriptExecutor exe = (JavascriptExecutor) driver;
			exe.executeScript("arguments[0].click();", element);
		}
		// Select the Locate Box field for typing without using JavaScript Executor
		WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='favs show']//*[text()='Search for Location / City']/parent::form/div/input")));
		WebElement locationBox = driver.findElement(By.xpath("//*[@class='favs show']//*[text()='Search for Location / City']/parent::form/div/input"));
		locationBox.sendKeys(Keys.ENTER);
		locationBox.sendKeys(location);
		By locatorList = By.xpath("//*[@class='favs show']//*[text()='Search for Location / City']/parent::form/div/input");
		
		Thread.sleep(6000);
		
		//Arrow down and press Enter key for the first option
		locationBox.sendKeys(Keys.DOWN);
		locationBox.sendKeys(Keys.RETURN);
		
		
		System.out.println("The temperature of "+ location + " on " + day + " is "+ getTempOfDay(driver,day));
		 }
		//Get the search results on a List and iterate through the list and click on the matching location
	/*	List<WebElement> elements = driver.findElements(locatorList);
		System.out.println("The number of search results are " + elements.size());
		for (WebElement element : elements) {
			if (element.getText().toLowerCase().contains("delhi".toLowerCase())) {
				Thread.sleep(3000);
				element.click();
				break;
			}
		}
*/	//	driver.findElement(By.xpath("//*[@class='favs show']//button[@title='Search']")).click();
	//Click Down Arrow and select the first option listed: this code doesn't work
	//	Actions a = new Actions(driver);
	//	a.sendKeys(Keys.ARROW_DOWN).click().build().perform();
	//	a.sendKeys(Keys.ENTER).click().build().perform();
		
		//Click on Search button
		
		// Type a location
	

		// *************
		// Enter "Time in" text in Search edit box and wait for 30 seconds to load the
		// results
	//	driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);

		// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='favs
		// show']//*[@aria-autocomplete='list']")));
		// get all the auto populated results - using xpath
		

		

		// Traverse each auto-suggest result and click on the result "time in india", if
		// this suggestion is displayed.
	//	for (WebElement element : elements) {
	//		if (element.getText().equalsIgnoreCase("Delhi")) {
	//			element.click();
	//			break;
		//	}

		}
//	*********************		

	// }

	public String getTempOfDay(WebDriver driver, String day) {
		String temp = null;

		{
			if (day.toLowerCase().contains("today".toLowerCase())) {
				temp = driver
						.findElement(By.xpath("//*[text() = 'Weather Forecast'] /parent:: div/section[1]/div[1]/span"))
						.getText();
				return temp;
			}

			else if (day.toLowerCase().contains("tomorrow".toLowerCase())) {
				temp = driver
						.findElement(By.xpath("//li[@data-aop='day2']//a[contains(@href,'weather')]/ul/li[1]/p[1]"))
						.getText();
				return temp;
			}

		}
		return temp;
	}

}
