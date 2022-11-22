package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author ajith
 * @Description Used to maintain the reusable methods
 * @Date 10-09-2022
 *
 */
public class Baseclass {
	public static WebDriver driver;

	/**
	 * @Description To get chromedriver
	 */
	public void getdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	/**
	 * @Description To load the respected URL
	 * @param url
	 */

	static public void loadurl(String url) {
		driver.get(url);
	}

	/**
	 * @Description To Maximize the current window
	 */
	public void Maximize() {
		driver.manage().window().maximize();
	}

	/**
	 * @Description findElement by ID
	 * @param data
	 * @return
	 */
	public WebElement findId(String data) {
		WebElement element = driver.findElement(By.id(data));
		return element;
	}

	/**
	 * @Description findElement by ID
	 * @param data
	 * @return
	 */
	public WebElement findPass(String data) {
		WebElement element = driver.findElement(By.id(data));
		return element;
	}

	/**
	 * @Description findElement by Xpath
	 * @param data
	 * @return
	 */
	public WebElement Xpath(String data) {
		WebElement element = driver.findElement(By.xpath(data));
		return element;
	}

	/**
	 * @Description findElement by Name
	 * @param data
	 * @return
	 */
	public WebElement classname(String data) {
		WebElement element = driver.findElement(By.name(data));
		return element;
	}

	/**
	 * @Description To perfrom click button
	 * @param element
	 */
	public void click(WebElement element) {
		element.click();
	}

	/**
	 * @Description To enter a value in the field we use sendkeys
	 * @param element
	 * @param text
	 */
	public void sendkeys(WebElement element, String text) {
		element.sendKeys(text);
	}

	/**
	 * @Description To perfrom action using keyboard(ENTER)
	 * @throws AWTException
	 */
	public void robotkeyenter() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	/**
	 * @Description To perfrom action using keyboard(TAB)
	 * @throws AWTException
	 */
	public void robotkeytab() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}

	/**
	 * @Description To perfrom action to see the Text
	 * @param element
	 * @param text
	 */
	public void selectvisibletext(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	/**
	 * @Description To see the values enter using sendkeys
	 * @param element
	 * @return
	 */
	public String getattribute(WebElement element) {
		String value = element.getAttribute("value");
		return value;
	}

	/**
	 * @Description To see the Text which is available in the current window
	 * @param element
	 * @return
	 */
	public String gettext(WebElement element) {
		String text = element.getText();
		return text;

	}

	/**
	 * 
	 * @param key
	 * @return String
	 * @throws FileNotFoundException
	 * @throws IOException
	 */

	public String getPropertyFilevalue(String key) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir") + "\\config\\config.properties"));
		String value = (String) properties.get(key);
		return value;
	}

	/**
	 * @Description select the particular Browertype
	 * @param browsertype
	 */

	public void getDriverBrowser(String browsertype) {
		switch (browsertype) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			break;
		}

	}

	/**
	 * @Description To take screenshot for a particular page/window/Element
	 * @return byte[]
	 * 
	 */
	public byte[] TakesScreenshot() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
		return screenshotAs;
	}

	/**
	 * @Description To close the entire window, we use quit
	 */
	public void quit() {
		driver.quit();
	}
	
	public static void elementClear(WebElement element) {
		element.clear();
	}
	
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
		

	}
	
	
	
	

