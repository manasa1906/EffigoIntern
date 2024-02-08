import java.util.logging.Logger;
import java.util.logging.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Manasa
 * Handling RadioButtons,CheckBoxes,Text,Links using Selenium*/

public class BasicHTMLControls {
	private static final Logger logger = Logger.getLogger(BasicHTMLControls.class.getName());
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	    Thread.sleep(3000);
	    driver.findElement(By.id("femalerb")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("englishchbx")).click();
	    Thread.sleep(3000);
	    WebElement hindicheck = driver.findElement(By.id("hindichbx"));
	    hindicheck.click();
	    Thread.sleep(3000); 
	    if(hindicheck.isSelected())
	    {
	    	hindicheck.click();
	    }
	    Thread.sleep(3000);
	    driver.findElement(By.id("registerbtn")).click();
	    Thread.sleep(3000);
	    String result = driver.findElement(By.id("msg")).getText();
	    logger.log(Level.INFO,"result");
	    Thread.sleep(3000);
	    driver.findElement(By.id("navigateHome")).click();
	    Thread.sleep(3000);
;	    driver.close();
	}

}
