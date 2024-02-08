import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class BrowserTest {
	public static void main(String args[])
	{
		
		WebDriver driver =new InternetExplorerDriver();
		driver.get("https://www.udemy.com/");
	}

}
