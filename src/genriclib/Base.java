package genriclib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Base {
	public FileLib fl=new FileLib();
	public WebDriver driver=null;
	public String prop="C:\\Users\\Samartha\\eclipse-workspace\\Amazon.framework\\testdata\\commondata.properties";
	public String excel="C:\\Users\\Samartha\\eclipse-workspace\\Amazon.framework\\testdata\\Amazon.xlsx";
@BeforeMethod
public  void configBC() throws Throwable {
	if (fl.getPropertyKeyValue(prop, "browser").equals("chrome")){
		driver=new ChromeDriver();
		System.out.println(driver);
	}
	else if (fl.getPropertyKeyValue(prop, "browser").equalsIgnoreCase("Firefox")){
		driver=new FirefoxDriver();
	}
Reporter.log("Opened the browser", true);
driver.manage().window().maximize();
Reporter.log("Maximized the browser", true);
driver.get(FileLib.getPropertyKeyValue(prop,"url"));
Reporter.log("url opened", true);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@AfterMethod
public void configAC() {
	driver.close();
	Reporter.log("Closed the browser", true);
}
}

