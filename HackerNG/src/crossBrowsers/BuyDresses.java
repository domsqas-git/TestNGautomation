package crossBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BuyDresses {
	
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void buyfiveDresses(String browserName)
		{
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "c:\\\\selenium\\\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		{
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		System.out.println(driver.getTitle());
		}
		
		}
		
		@Test (priority=1)
		public void DressTab()
		{
			//Navigate to Dress page
			driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();	
		}
		
		@Test(priority=2)
		public void firstDress() throws InterruptedException
		{
			Thread.sleep(2000);
			
			@SuppressWarnings("unused")
			JavascriptExecutor driver0;
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,1000)");
			
			 Actions action = new Actions(driver);
			
			//Add to Cart 1st Dress
			 WebElement we = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]"));
				action.moveToElement(we).build().perform();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
			
			Thread.sleep(2000);
			//Continue Shopping
			driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();
		}
		
		@Test(priority=3)
		public void secondDress() throws InterruptedException
		{
			Thread.sleep(2000);
			//Add to Cart 2nd Dress
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")).click();
			
			Thread.sleep(2000);
			//Continue Shopping
			driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();
		}
		
		@Test(priority=4)
		public void thirdDress() throws InterruptedException
		{
			//3rd Dress
			Actions action = new Actions(driver);
			
			 WebElement we1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[3]"));
				action.moveToElement(we1).build().perform();
			
			Thread.sleep(2000);
			//Click on "More" on 3rd Dress
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[3]/div/div[2]/div[2]/a[2]/span")).click();
			
			Thread.sleep(2000);
			//Expand picture
			driver.findElement(By.id("bigpic")).click();
			
			Thread.sleep(2000);
			//Scroll to other picture
			driver.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/a")).click();
			
			Thread.sleep(2000);
			//Close picture
			driver.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/a")).click();
			
			Thread.sleep(2000);
			//Add to cart 3rd dress
			driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
			
			Thread.sleep(2000);
			//Continue Shopping
			driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();
			
			Thread.sleep(2000);
			//click Dresses on the "directory" above picture
			driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/a[3]")).click();
		}
		
		@Test(priority=5)
		public void fourthDress() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(By.id("search_query_top")).sendKeys("Printed summer dress ");
			
			//enter to procede
			Thread.sleep(2000);
			driver.findElement(By.id("search_query_top")).sendKeys(Keys.ENTER);
			
			//click quick view
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")).click();
			
			//Add to cart
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
			
			//Close popup
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
			
			//Click shopping  Cart
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
			
			//Click picture of the Dress
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"product_6_31_0_0\"]/td[1]/a/img")).click();
			
			Thread.sleep(2000);
			//Add quantity to Dress 4
			driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).click();
			
			Thread.sleep(2000);
			//Clear box quantity on Dress 4
			driver.findElement(By.id("quantity_wanted")).clear();
			
			Thread.sleep(2000);
			//Change quantity to 3pc on Dress 4
			driver.findElement(By.id("quantity_wanted")).sendKeys("3");
			
			Thread.sleep(2000);
			//Select size in dropdown menu
			new Select (driver.findElement(By.id("group_1"))).selectByVisibleText("M");
			
			Thread.sleep(2000);
			//Add to cart 4th dress
			driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
			
			Thread.sleep(2000);
			//Close popup
			driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
			
			Thread.sleep(2000);
			//Go back to Dress by main tab
			driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
		}
		
		@Test(priority=6)
		public void fifthChiffonDress() throws InterruptedException
		{
			//Search box (chiffon)
			Thread.sleep(2000);
			driver.findElement(By.id("search_query_top")).sendKeys("chiffon ");
			
			//Click search button
			Thread.sleep(2000);
			driver.findElement(By.name("submit_search")).click();
			
			//Click image to access dress page
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")).click();
			
			Thread.sleep(2000);
			//Change color on Dress 5
			driver.findElement(By.id("color_15")).click();
			
			//Send email to friend
			Thread.sleep(2000);
			driver.findElement(By.id("send_friend_button")).click();
			
			//Friend name
			driver.findElement(By.id("friend_name")).sendKeys("Beautiful Girl");
			
			//Friend email
			driver.findElement(By.id("friend_email")).sendKeys("beautiful@handsome.com");
			
			//Cancel email send
			driver.findElement(By.xpath("//*[@id=\"send_friend_form_content\"]/p/a")).click();
			
			//Add to cart 5th dress
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
			
			//Close popup
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();	
			
			//Click on shopping cart
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b")).click();
			
			//Delete extra dress
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"6_31_0_0\"]/i")).click();
		}
		
		@Test(priority=7)
		public void contcatUs() throws InterruptedException
		{
			//Contact us 
			Thread.sleep(2000);
			driver.findElement(By.id("contact-link")).click();
					
			//Contact us form
			new Select(driver.findElement(By.id("id_contact"))).selectByVisibleText("Customer service");
					
			//Email address
			driver.findElement(By.id("email")).sendKeys("sogno@illeggittimo.com");
					
			//Order reference
			driver.findElement(By.id("id_order")).sendKeys("7 dresses");
					
			//Message
			driver.findElement(By.id("message")).sendKeys("I'm purchasing seven dresses, can I've an extra 20% off. Grazie!!");
					
			//Send message
			driver.findElement(By.xpath("//*[@id=\"submitMessage\"]/span")).click();
					
			//Back Home button
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span")).click();
		}
		
		@Test(priority=8)
		public void CartShopCost() throws InterruptedException
		{
			//Cart
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
			
			//Proceed to checkout
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
			
			//Click on shopping cart
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b")).click();
			
			//Print dress 1 info
			System.out.println(driver.findElement(By.xpath("//*[@id=\"product_3_13_0_0\"]/td[2]/p/a")).getText());
			System.out.println(driver.findElement(By.xpath("//*[@id=\"product_3_13_0_0\"]/td[2]/small[2]/a")).getText());
			System.out.println(driver.findElement(By.id("total_product_price_3_13_0")).getText());
			
			//Print dress 2 info
			System.out.println(driver.findElement(By.xpath("//*[@id=\"product_4_16_0_0\"]/td[2]/p/a")).getText());
			System.out.println(driver.findElement(By.xpath("//*[@id=\"product_4_16_0_0\"]/td[2]/small[2]/a")).getText());
			System.out.println(driver.findElement(By.id("total_product_price_4_16_0")).getText());
	
			//Print dress 3 info
			System.out.println(driver.findElement(By.xpath("//*[@id=\"product_5_19_0_0\"]/td[2]/p/a")).getText());
			System.out.println(driver.findElement(By.xpath("//*[@id=\"product_5_19_0_0\"]/td[2]/small[2]/a")).getText());
			System.out.println(driver.findElement(By.id("total_product_price_5_19_0")).getText());
			
			
			//Print dress 4
			System.out.println(driver.findElement(By.xpath("//*[@id=\"product_6_31_0_198772\"]/td[2]/p/a")).getText());
			System.out.println(driver.findElement(By.xpath("//*[@id=\"product_6_31_0_198772\"]/td[2]/small[2]/a")).getText());
			System.out.println(driver.findElement(By.id("total_product_price_6_31_198772")).getText());
			
			//Print dress 5
			System.out.println(driver.findElement(By.xpath("//*[@id=\"product_7_34_0_198772\"]/td[2]/p/a")).getText());
			System.out.println(driver.findElement(By.xpath("//*[@id=\"product_7_34_0_198772\"]/td[2]/small[2]/a")).getText());
			System.out.println(driver.findElement(By.id("total_product_price_7_34_198772")).getText());
			
			//Total 
			System.out.println(driver.findElement(By.id("total_price")).getText());
		}
		
		@Test(priority=9)
		public void SignInOut() throws InterruptedException
		{
			//Sign in
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
			
			//Forgot Pass
			Thread.sleep(2000);
			driver.findElement(By.linkText("Forgot your password?")).click();
			
			//Back to Login
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span")).click();
			
			//Email
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("king@lookinggood.net");
			
			//Password
			driver.findElement(By.id("passwd")).sendKeys("Tusei1");
			
			//Click Sign in button
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
			
			//Order History
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")).click();
			
			//Click Logo to return home
			driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")).click();
			
			//Sign out
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
			
			 double i1 = 26.00; 
				double i2 = 16.40;
				double i3 = 91.50;
				double i4 = 28.98;
				double i5 = 50.99;
			      double d1= i1 + i2 +i3 +i4 +i5;

			      System.out.println(d1);
			      
			      System.out.println("note: the total shows the summ of all of the dresses but dresses printed are just three. I wasn't able to print the other two and the total with any locators" );
			      
			
		}
		
		@AfterTest
		public void CloseBrowser()
		{
			driver.quit();
		}
		
}
