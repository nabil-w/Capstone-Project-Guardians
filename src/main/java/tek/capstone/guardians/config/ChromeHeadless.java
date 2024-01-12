package tek.capstone.guardians.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadless implements Browser{
	//  Headless? browser is executing test but we cant see UI because it runs in the backround not infront
	public WebDriver openBrowser(String url){
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get(url);
		return driver;
	}

}
