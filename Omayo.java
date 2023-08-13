package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Omayo {

	public static void main(String[] args) throws InterruptedException {
		
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://omayo.blogspot.com/");
				WebElement dropdown = driver.findElement(By.xpath("//select[@id='drop1']"));
				dropdown.click();
				Select sedrop = new Select(dropdown);
				sedrop.selectByIndex(3);
				System.out.println(3 +"Is selected");
				
				WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
				
				search.sendKeys("Pawankalyan");
				WebElement radiooptions = driver.findElement(By.xpath("//input[@id='radio1']"));
				radiooptions.click();
				
				//Alert window with ok button
				
				driver.findElement(By.xpath("//input[@id='alert1']")).click();
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
				//Check Box
				driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
				
				//GetPrompt
				driver.findElement(By.xpath("//input[@id='prompt']")).click();
				Thread.sleep(3000);
				driver.switchTo().alert().dismiss();
				
				//Confirmation Dialog
				driver.findElement(By.xpath("//input[@id='confirm']")).click();
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
				
				//HTML Form
				driver.findElement(By.xpath("//form[@name='form1']//input[@type='text']")).sendKeys("Mohan");
				driver.findElement(By.xpath("//form[@name='form1']//input[@type='password']")).sendKeys("7993922790");
				driver.close();
				driver.quit();
				
			}
}
		


	
