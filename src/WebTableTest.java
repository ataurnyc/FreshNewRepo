import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "WebDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//ROW: /html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[3]
				
		
		int row  = driver.findElements(By.xpath("//div[@class='rt-tr-group']")).size();
		System.out.println(row);
		
		
		int column = driver.findElements(By.xpath("//div[@class='rt-th rt-resizable-header -cursor-pointer']")).size();
		System.out.println(column);

		
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=column;j++) {
			System.out.print(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div["+i+"]/div/div["+j+"]")).getText());
			System.out.print('\t');
			}
			
			System.out.println();
		}
		
		
		driver.close();
	}

}
