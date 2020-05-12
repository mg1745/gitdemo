package chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openchrome {

	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		//By.ClassName(ClassName);
	//	By.id(id);
		//By.linkText(linkText);
		//By.className(className);
		//By.ByPartialLinkText(partiallinktext);
		//By.tagName(tagName);
		//By.cssSelector(cssSelector);
		//By.xpath(xpathExpression);
		driver.get("https://google.com");

		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("selenium");
		//List <WebElement> eles =driver.findElements(By.tagName("input"));
		//for(WebElement ele : eles) {
		//	if(ele.getAttribute("title").contentEquals("Search")) {
				//ele.click();
				//ele.clear();
			//	ele.sendKeys("Hello World");
				//break;
				
			//}
	//	}
		//driver.findElement(By.xpath("//input[@title='Search]")).click();
		//driver.findElement(By.xpath("//input[@title='Search]")).clear();
		//driver.findElement(By.xpath("//input[@title='Search]")).sendKeys("x path");
		driver.findElement(By.partialLinkText("Gma")).click();
		//System.out.println(ele.getAttribute("title"));
		}
		//driver.manage().window().maximize();
		
		//Thread.sleep(3000);
//driver.quit();

	}
	

//}
