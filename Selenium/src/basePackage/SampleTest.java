package basePackage;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.xpath.functions.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Functions;


public class SampleTest extends BaseTestPage implements TestInterface
{
	public static void main (String[] args)
	{
		int i=20,j=30;
		System.out.println(num);
		WebElement element, ListOfelement;
		element= driver.findElement(By.xpath("/div/xys"));
		
	
	/*Select dropdown=new Select(element);
	List<WebElement> options= dropdown.getOptions();*/
		
		
	}
	
	
	public void xyz () {
		Wait<WebDriver> Twait = new FluentWait<WebDriver>(driver)
				.withTimeout(50, TimeUnit.SECONDS)
				.pollingEvery(10, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);	
		
		/*WebElement ele =Twait.until(new com.google.common.base.Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				WebElement ele2=  driver.findElement(By.xpath("/div/xys"));
				String value = ele.getAttribute("innerHTML");
				if (value.equals("WebDriver")){
				return ele;
				
			}
			return null;	}
				}
			});*/
	}
	}
			
	