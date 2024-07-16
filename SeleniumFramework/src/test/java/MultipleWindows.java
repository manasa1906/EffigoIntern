import java.util.logging.Logger;
import java.util.Set;
import java.util.logging.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * Manasa
 * Handling multiple Tabs and Windows through selenium
 */
public class MultipleWindows {
	private static Logger logger = Logger.getLogger(MultipleWindows.class.getName());
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		//New Window
		String parentWindowHandle = driver.getWindowHandle();
		logger.log(Level.INFO,"Parentwindow"+parentWindowHandle+driver.getTitle());
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String windowHandle : windowHandles) {
			if(!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				driver.manage().window().maximize();
				Thread.sleep(3000);
				driver.findElement(By.id("firstName")).sendKeys("Manasa in child window");
				Thread.sleep(3000);
				driver.close();
			}
		}
	 driver.switchTo().window(parentWindowHandle);
	 driver.findElement(By.id("name")).sendKeys("Manasa in Parent window");
	 
	 //Single tab
	 
	 String parentTabHandle = driver.getWindowHandle();
		logger.log(Level.INFO,"ParentTab"+parentTabHandle+driver.getTitle());
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> tabHandles = driver.getWindowHandles();
		for(String tabHandle : tabHandles) {
			if(!tabHandle.equals(parentTabHandle)) {
				driver.switchTo().window(tabHandle);
				Thread.sleep(3000);
				driver.findElement(By.id("alertBox")).click();
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
				Thread.sleep(3000);
				driver.close();
			}
		}
	 driver.switchTo().window(parentTabHandle);
	 driver.findElement(By.id("name")).sendKeys("Manasa in Parent Tab");
	 Thread.sleep(3000);
     driver.quit();
	}

}
