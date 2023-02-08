import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class MidTerm {

	@Test
	void test() throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.findElement(By.xpath("//*[@id=\"vfb-5\"]")).sendKeys("Siripoom");
		driver.findElement(By.xpath("//*[@id=\"vfb-7\"]")).sendKeys("Luengsaard");
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-13-address\"]")).sendKeys("10/1");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-address-2\"]")).sendKeys("10");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-city\"]")).sendKeys("Nakorn Pathom");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("Mueang");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]")).sendKeys("73000");
		driver.findElement(By.xpath("//*[@id=\"vfb-14\"]")).sendKeys("644259035@webmail.npru.ac.th");
		driver.findElement(By.xpath("//*[@id=\"vfb-18\"]")).sendKeys("02/08/66");
		driver.findElement(By.xpath("//*[@id=\"vfb-19\"]")).sendKeys("0855429355");
		
		driver.findElement(By.xpath("//*[@id=\"vfb-20-0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-5\"]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-23\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id=\"vfb-3\"]")).sendKeys("99");
		
		driver.findElement(By.xpath("//*[@id=\"vfb-4\"]")).click();
		
		Thread.sleep(4000);
		
		String result = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/div/h2")).getText();
		
		assertEquals("Dynamic Transaction Verification",result);
		
		Thread.sleep(4000);
		driver.quit();
	}

}
