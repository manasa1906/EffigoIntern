import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * Manasa
 * Handling frames through Selenium
 */
public class TestFrames {
	private static Logger logger = Logger.getLogger(TestAlerts.class.getName());
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	    driver.findElement(By.id("name")).sendKeys("Text1");//MainCOntent
	    Thread.sleep(3000);
	    driver.switchTo().frame("frm1"); //frame 1
	    Select courseName_DD = new Select(driver.findElement(By.id("course")));
	    courseName_DD.selectByVisibleText("Java");
	    driver.switchTo().defaultContent();//MainContent
	    driver.switchTo().frame("frm2"); //frame 2
	    driver.findElement(By.id("firstName")).sendKeys("Manasa");
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();//MainContent
	    driver.switchTo().frame("frm1"); //frame 1
	    courseName_DD.selectByVisibleText("Dot Net");
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();//MainContent
	    driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys("Text2");
	    Thread.sleep(3000);
	    driver.quit();
	}

}
