import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class devProjectJava {
	
	public static WebDriver driver;
	String url = "https://www.facebook.com/";
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void validatePageTitle() {
		String actualtitle = driver.getTitle();
		String expectedTitle ="Facebook - log in or sign up";
		
		if(actualtitle.equals(expectedTitle)) {
			System.out.println("Title Matched - Test Passed");
		} else {}
		System.out.println("Tittle didn't match - Test Failed");
	}
	
	
	@Test
	public void validatePageUrl() {
		String actualUrl = driver.getCurrentUrl();
		if(actualUrl.equals(url)) {
			System.out.println("URL Matched - Test Passed");
		} else {
			System.out.println("URL didn't match - Test Failed");
		}
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
