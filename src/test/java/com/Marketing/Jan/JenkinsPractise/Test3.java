package com.Marketing.Jan.JenkinsPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	public void tc3()
	{
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
