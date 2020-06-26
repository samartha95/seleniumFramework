package genriclib;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonsUtil {
	public static void mouseHover(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	public static void switchWindow(WebDriver driver) {
		Set<String> sid = driver.getWindowHandles();
		Iterator<String>i=sid.iterator();
		String pid = i.next();
		String cid = i.next();
		driver.switchTo().window(cid);
	}
}
