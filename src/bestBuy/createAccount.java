package bestBuy;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;



public class createAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver","F:\\DOWNLOADS\\edge\\edgedriver_win64\\msedgedriver.exe");
		
		EdgeDriver driver =  new EdgeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.xpath("//*[@id=\"account-menu-account-button\"]/span")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.linkText("Create Account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.name("firstName")).sendKeys("Sunjida Nourin");
		driver.findElement(By.name("lastName")).sendKeys("Shathi");
		driver.findElement(By.name("email")).sendKeys("sunjidanourinshathi89@gmail.com");
		driver.findElement(By.name("fld-p1")).sendKeys("Amibest#1");
		driver.findElement(By.name("reenterPassword")).sendKeys("Amibest#1");
		driver.findElement(By.name("phone")).sendKeys("01680901872");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.xpath("/html/body/div[1]/div/section/main/div[2]/div/div/div[1]/div/div/div/div/div/form/div[8]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		System.out.println("login Test Successful"); 


	}

}
