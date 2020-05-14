package webGeneric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods {

	public static WebDriver driver;

	public static WebDriver initialiseDriver() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Beula\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

	/*
	 * Aim: To return if the WebElement is present
	 */
	public boolean isElementPresent(WebDriver driver, By by) {
		boolean isPresent = true;
		boolean result;
		waituntilElementVisible(driver, by);
		// search for elements and check if list is empty
		result = driver.findElements(By.xpath("//div[@class='mylocationsxx']/div[1]/span")).isEmpty();
		System.out.println("The weblement present is " + result);
		if (result) {

			isPresent = false;
		}
		// rise back implicitly wait time

		return isPresent;
	}

	public void IsElementValid(WebDriver driver, By by) {
		boolean present;
		try {
			driver.findElement(by);
			present = true;
		} catch (Exception e) {
			present = false;
			System.out.println("The present value in try & catch block is "+ e);
		}
		
		
	}

	/*
	 * Aim: Javascript Executor to scroll the window to the bottom
	 */
	public void ScrollToBottom(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	/*
	 * Aim: Javascript Executor to scroll the window to the top
	 */
	public void ScrollToTop(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight");
	}

	public void waituntilElementVisible(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void waitUntilElementClickable(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	/*
	 * public WebElement locateLink(String identifier, WebDriver driver) {
	 * 
	 * WebElement linkElement = null; String xpath1 =
	 * String.format("//a[contains(@href,'%s')]", identifier); //
	 * driver.findElement(By.xpath(xpath1)); System.out.println(xpath1); linkElement
	 * = driver.findElement(By.xpath(xpath1)); System.out.println(linkElement);
	 * return linkElement;
	 * 
	 * }
	 * 
	 * public void locateLink() {
	 * 
	 * driver.findElement(By.linkText("TRAVEL")).click();
	 * System.out.println(driver.getTitle()); driver.findElement(By.
	 * xpath("//a[contains(@href, 'lifestyle')] [contains(@data-m,'lifestyle')]")).
	 * click();
	 * 
	 * }
	 */
}
