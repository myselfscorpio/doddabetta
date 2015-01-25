import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author Gaurang_Shah
 */
public class GoogleTest {
	private WebDriver driver;

	@Test
	public void verifySearch() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		Thread.sleep(16000);
		driver.quit();
		
	}
}