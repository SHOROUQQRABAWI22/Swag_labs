//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//
//public class myClass {
//	WebDriver driver = new ChromeDriver();
//
//	@BeforeTest
//	public void setup() {
//
//		driver.get("https://www.saucedemo.com/");
//		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//
//	}
//
//	@Test(priority=1)
//	public void Test1() throws InterruptedException {
//
////		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
////		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
////		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		List<WebElement> add_button = driver.findElements(By.className("btn_primary"));
//		for (int i = 0; i < add_button.size(); i++) {
//			add_button.get(i).click();
//			System.out.println(add_button);
//
//		}
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("shoroq");
//		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("mohammad");
//		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("1234");
//		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
//
//		driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
//		Thread.sleep(3000);
//String ActualResult=driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();
//String Expected="Thank you for your order!";
//SoftAssert asser=new SoftAssert();
//asser.assertEquals(ActualResult,Expected);
//asser.assertAll();
//	}
//	@Test(priority=2)
//	public void Test2() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.get("https://www.saucedemo.com/");
//		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		List<WebElement> add_button = driver.findElements(By.className("btn_primary"));
//		for (int i = 0; i < add_button.size(); i++) {
//			add_button.get(i).click();
//
//	}
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("shoroq");
//		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("mohammad");
//	driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("1234");
//		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]")).click();
//		String total = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]"))
//				.getText();
//
//		String[] price = total.split("\\$");
//		// System.out.print(price[1]);
//		SoftAssert asser = new SoftAssert();
//
//asser.assertEquals(price[1], "140.34");
//asser.assertAll();
//	}
//
//	@Test(priority=3)
//	public void Test3() throws InterruptedException {
//
//		//driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
//		//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
//		//driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		List<WebElement> add_button = driver.findElements(By.className("btn_primary"));
//		for (int i = 0; i < add_button.size(); i++) {
//			add_button.get(i).click();
//
//}
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("shoroq");
//		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("mohammad");
//		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("1234");
//		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]")).click();
//		String total = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]"))
//				.getText();
//		String ActualURL = driver.getCurrentUrl();
//		String ExpectedURL = "https://www.saucedemo.com/checkout-step-two.html";
//		SoftAssert asser = new SoftAssert();
//
//		asser.assertEquals(ActualURL, ExpectedURL);
//		asser.assertAll();
//
//	}
//
//}
