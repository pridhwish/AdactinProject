package com.maven.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
/////////////===========  1.Browser Launch ==============//////////////
public static WebDriver driver;

public static WebDriver browserLaunch(String browser) {
try {
	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\Driver\\chromedriver.exe") );
		driver = new ChromeDriver();		}
	else if (browser.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver",System.getProperty("uder.dir")+("\\Driver\\edgedriver.exe"));
		driver = new EdgeDriver();
		}
	else if (browser.equalsIgnoreCase("gecko")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+("\\Driver\\firefoxdriver.exe"));
		driver = new FirefoxDriver();
			
		}
	else {
		System.out.println("Invalid Browser");
	}
} catch (Exception e) {
	
	e.printStackTrace();
}
driver.manage().window().maximize();
return driver;
	
}
/////////////===========  2.get Url ==============//////////////
public static void url(String value) {
driver.get(value);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
/////////////===========  3.Send Keys ==============//////////////
public static void inputOfElement(WebElement element, String value) {
 element.sendKeys(value);

}
/////////////===========  4.click ==============//////////////
public static void clickOnElement(WebElement element) {
element.click();


}
/////////////===========  5.Drop Down ==============//////////////
public static void dropDown(WebElement element, String options,String value) {
Select s = new Select(element);
try {
	if (options.equalsIgnoreCase("ByIntex")) {
		int parseInt = Integer.parseInt(value);
		s.selectByIndex(parseInt);
		
	}
	else if (options.equalsIgnoreCase("ByValue")) {
		s.selectByValue(value);
		
		
	}
	else if (options.equalsIgnoreCase("ByVisibleText")) {
		s.selectByVisibleText(value);
		
		
	}
	else {
		System.out.println("Selection Invalid");
	}
} catch (NumberFormatException e) {
	
	e.printStackTrace();
}
/////////////===========  6. Close ==============//////////////
}
public static void closeBrowser() { 
driver.close();
/////////////===========  7.Quit ==============//////////////
}
public static void quitBrowser() { 
driver.quit();


}
/////////////===========  8.alert ==============//////////////
 public static void altertAccept() {
	 driver.switchTo().alert().accept();
}

public static void alertDismiss() {
	driver.switchTo().alert().dismiss();

}	
		
public static void promptAccept(String value) {
	driver.switchTo().alert().sendKeys(value);
	driver.switchTo().alert().accept();
	}
		
/////////////===========  9.Mouse Action ==============//////////////
public static void mouseAction(String options, WebElement element, WebElement element1) {
Actions ac = new Actions(driver);
try {
	if (options.equalsIgnoreCase("moveToElement")) {
		ac.moveToElement(element).build().perform();
		
	}
	else if (options.equalsIgnoreCase("contextClick")) {
		ac.contextClick(element).build().perform();
		
	}
	else if (options.equalsIgnoreCase("doubleClick")) {
		ac.doubleClick(element).build().perform();
		
	}
	
	else if (options.equalsIgnoreCase("dragAndDrop")) {
		ac.dragAndDrop(element, element1).build().perform();
	}
		else {
			System.out.println("Mouse action failed");
		}
} catch (Exception e) {
	
	e.printStackTrace();
}


	
}
/////////////===========  10.screenshot ==============//////////////-------not completed
public static void screenshot(String path) throws IOException {
TakesScreenshot ts = (TakesScreenshot) driver;
File srcFile = ts.getScreenshotAs(OutputType.FILE);
File desFile = new File (path);
FileUtils.copyFileToDirectory(srcFile, desFile);


}

/////////////===========  11.Navigate to ==============//////////////
public static void navigateTo(String value) {
driver.navigate().to(value);

}
/////////////===========  12.Navigate  back ==============//////////////
public static void navigateBack(){
driver.navigate().back();
}

/////////////===========  13.Navigate forward ==============//////////////
public static void navigateForward(){
driver.navigate().forward();
}
/////////////===========  14.Navigate refresh ==============//////////////
public static void navigateRefresh() {
driver.navigate().refresh();

}



/////////////===========  16.clear ==============//////////////
public static void clearOnElement(WebElement element) {
element.clear();
}
////////////============= 17scrollUd =============/////////////////
public static void scrollUd(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",element);

}
/////////////===========  18 Enable ==============//////////////
public static void enable(WebElement element) {
	element.isEnabled();

}
/////////////===========  19 Display  ==============//////////////
public static void display(WebElement element) {
element.isDisplayed();

}

/////////////===========  20 Selected  ==============//////////////
public static void selected(WebElement element) {
element.isSelected();

}
/////////////===========  21 Current url  ==============//////////////
public static void currentUrl() {
	 String url = driver.getCurrentUrl();
	System.out.println(url);
	


}
//////////////========== 22 Title=====================///////////////
public static void getTitle() {
	 String title = driver.getTitle();
      System.out.println(title);


}

/////////////===========  23 text ==============//////////////
 public static void text() {
	System.out.println(driver.getTitle());
 }	
/////////////===========  24 options ==============//////////////
public static void options(WebElement element) {
	Select s = new Select(element);
	List<WebElement> options = s.getOptions();
    for (WebElement s1 : options) {
    	System.out.println(s1.getText());
		
}

}	
/////////////===========  25 attributes ==============//////////////
//public static void attributes(WebElement element) {
	//String attributes = element.getAttribute("value");
	

//}
/////////////===========  26 right click ==============//////////////
public static void rightClick(WebElement element) {
	Actions ac = new Actions(driver);
	ac.contextClick(element).build().perform();

}
/////////////===========  27 double click ==============//////////////
public static void doubleClick(WebElement element) {
	Actions ac = new Actions(driver);
	ac.doubleClick(element).build().perform();
	

}
/////////////===========  28 drag and drop ==============//////////////
public static void dragAndDrop(WebElement source , WebElement target) {
	Actions ac = new Actions(driver);
	ac.dragAndDrop(source, target).build().perform();
	

}
////////////===========  29 move to element ==============//////////////
public static void moveToElement(WebElement element) {
Actions ac = new Actions(driver);
ac.moveToElement(element).build().perform();
}
////////////===========  30 single frame ==============//////////////
public static void singleFrame(String value) {
	driver.switchTo().frame(value);

}
////////////===========  31 frames ==============//////////////
public static void frames (WebElement element) {
driver.switchTo().frame(element);

}
////////////===========  32 iframes ==============//////////////
public static void iFrames (WebElement element) {
driver.switchTo().defaultContent();
}


/////////////===========  33robot ==============//////////////
public static void robots(int KeyEvent) throws AWTException  {
Robot r = new Robot();
r.keyPress(KeyEvent);
}
/////////////===========  34 radiobutton ==============//////////////
public static void radioBtn(WebElement element) {
	element.click();

}
}
