import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/** HandlingTextBoses through Selenium */

public class HandleTestBoxes {
	private static final Logger logger = Logger.getLogger(HandleTestBoxes.class.getName());
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("login_field"));
		if (username.isDisplayed()) {
			if (username.isEnabled()) {
                 username.sendKeys("Manasa");
                 String enteredText = username.getAttribute("value");
				logger.log(Level.INFO, "enteredText");
				Thread.sleep(3000);
				 username.sendKeys("Sai");
				 Thread.sleep(3000);
				username.clear();
			} else 
				logger.log(Level.SEVERE, "Not Enabled");

		} else 
			logger.log(Level.SEVERE, "Not Displayed");
		
		driver.close();
	}
}
