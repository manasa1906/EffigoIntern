import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/**
 * Manasa
 * Handling Dropdowns through Selenium
 * */
public class DropDowns {
  private static Logger logger = Logger.getLogger(DropDowns.class.getName());
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement course = driver.findElement(By.id("course"));
		Select courseDropdown = new Select(course);
		List<WebElement> Options = courseDropdown.getOptions();
		for(WebElement Option : Options) {
			logger.log(Level.INFO,Option.getText()); 
		}
		courseDropdown.selectByValue("js");
		Thread.sleep(3000);
		courseDropdown.selectByIndex(1);
		Thread.sleep(3000);
		courseDropdown.selectByVisibleText("Dot Net");
		List<WebElement> selectedOptions = courseDropdown.getAllSelectedOptions();
		logger.log(Level.INFO,"Final Selected Option:"); 
		for(WebElement Option : selectedOptions) {
			logger.log(Level.INFO,Option.getText()); 
		}
		
		WebElement ide = driver.findElement(By.id("ide"));
		Select ideDropdown = new Select(ide);
		List<WebElement> ides = courseDropdown.getOptions();
		for(WebElement Option : ides) {
			logger.log(Level.INFO,Option.getText()); 
		}
		ideDropdown.selectByValue("ec");
		Thread.sleep(3000);
		ideDropdown.selectByIndex(2);
		Thread.sleep(3000);
		ideDropdown.deselectByValue("ec");
		Thread.sleep(3000);
	    ideDropdown.selectByVisibleText("NetBeans");
		List<WebElement> selectedides = ideDropdown.getAllSelectedOptions();
		logger.log(Level.INFO," Selected Options:"); 
		for(WebElement Option : selectedides) {
			logger.log(Level.INFO,Option.getText()); 
		}
		driver.close();
	}

}
