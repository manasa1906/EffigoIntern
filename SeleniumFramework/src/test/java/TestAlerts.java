import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.logging.Level;
/**
 * Manasa
 * Handling Alerts through Selenium
 */
public class TestAlerts {
	private static Logger logger = Logger.getLogger(TestAlerts.class.getName());
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    //AlertBox
	    driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	    Thread.sleep(3000);
	    logger.log(Level.INFO, driver.findElement(By.id("output")).getText());
	    driver.findElement(By.id("alertBox")).click();
	    Thread.sleep(3000);
	    logger.log(Level.INFO,driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	    logger.log(Level.INFO, driver.findElement(By.id("output")).getText());
	    Thread.sleep(3000);
	    ////PromptBox
	    logger.log(Level.INFO, driver.findElement(By.id("output")).getText());
	    driver.findElement(By.id("confirmBox")).click();
	    Thread.sleep(3000);
	    logger.log(Level.INFO,driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	    logger.log(Level.INFO, driver.findElement(By.id("output")).getText());
	    Thread.sleep(3000);
	    driver.findElement(By.id("confirmBox")).click();
	    Thread.sleep(3000);
	    logger.log(Level.INFO,driver.switchTo().alert().getText());
	    driver.switchTo().alert().dismiss();
	    logger.log(Level.INFO, driver.findElement(By.id("output")).getText());
	    Thread.sleep(3000);
	    //PromptBox
	    logger.log(Level.INFO, driver.findElement(By.id("output")).getText());
	    driver.findElement(By.id("promptBox")).click();
	    logger.log(Level.INFO,driver.switchTo().alert().getText());
	    driver.switchTo().alert().sendKeys("Manasa");
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    logger.log(Level.INFO, driver.findElement(By.id("output")).getText());
	    driver.findElement(By.id("promptBox")).click();
	    Thread.sleep(3000);
	    logger.log(Level.INFO,driver.switchTo().alert().getText());
	    driver.switchTo().alert().dismiss();
	    logger.log(Level.INFO, driver.findElement(By.id("output")).getText());
	    Thread.sleep(3000);
	    driver.quit();
	}

}
