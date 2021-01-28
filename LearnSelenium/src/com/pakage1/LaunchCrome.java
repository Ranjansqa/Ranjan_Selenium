package com.pakage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchCrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Zubi\\LearnSelenium\\chromedriver.exe");
		//System.setProperty("webdriver.Firefox.driver", "D:\\Selenium\\Zubi\\LearnSelenium\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
	}

}
