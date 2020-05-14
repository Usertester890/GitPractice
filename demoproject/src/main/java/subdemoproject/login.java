package subdemoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
		
	public login(String identifier) {
		
	}

	public static void main(String[] args) {
		WebDriver driver;
		
		
		String identifier1 = "Brocolli";
		
		/*
			
		public void initialisedDriver() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Beula\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		*/
		
			
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Beula\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			//driver = new ChromeDriver();
			//driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			//driver.findElement(By.xpath("//h4[@class='product-name'][contains(text(),'Brocolli')]/parent::div/div[2]/a[2]")).click();

			String xpath = String.format("//h4[@class='product-name'][contains(text(),'%s')]/parent::div/div[2]/a[2]", identifier1);
			System.out.println(xpath);
		

/*driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();

	driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
*/

	}

	public void initialisedDriver() {
		
	}	
}
