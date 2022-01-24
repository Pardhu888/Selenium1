package something;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazon1 {
@Test
	public void Testproject()
	{

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\pardhasaradhi.velic\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver d1 =new ChromeDriver();
		 d1.get("https://www.amazon.com/ap/register?openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		 d1.findElement(By.id("ap_customer_name")).sendKeys("pardhasaradhi");
		 d1.findElement(By.name("email")).sendKeys("pardhasaradhi.s8267@gmail.com");
		 d1.findElement(By.name("password")).sendKeys("pardhu143");
		d1.findElement(By.name("passwordCheck")).sendKeys("pardhu143");
		d1.findElement(By.xpath("//input[@id='continue']")).click();
	}

	
}
