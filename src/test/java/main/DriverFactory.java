package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import main.Propriedades.Browsers;

public class DriverFactory {

	public static WebDriver driver;

	private DriverFactory() {
	}

	public static void navegador(Browsers param) {
		Propriedades.browser = Browsers.CHROME;
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			switch (Propriedades.browser) {
			case FIREFOX:
				driver = new FirefoxDriver();
				break;
			case CHROME:
				System.setProperty("webdriver.chrome.driver", "C:/Users/fzanin/Downloads/chromedriver_win32/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case EXPLORER:
				driver = new EdgeDriver();
				break;
			case SAFARI:
				driver = new SafariDriver();
				break;
			default:
				break;
			}
			driver.manage().window().maximize();
			return driver;
		}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
