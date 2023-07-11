package com.framework.selenium.api.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.sukgu.Shadow;

public class DriverInstance  extends AbstractTestNGCucumberTests{

	private static final ThreadLocal<RemoteWebDriver> remoteWebdriver = new ThreadLocal<RemoteWebDriver>();
	private static final ThreadLocal<WebDriverWait> wait = new  ThreadLocal<WebDriverWait>();

	public Shadow dom;
	public void setWait() {
		wait.set(new WebDriverWait(getDriver(), Duration.ofSeconds(10)));
	}

	public WebDriverWait getWait() {
		return wait.get();
	}

	public void setDriver(String browser, boolean headless) throws MalformedURLException {		
		switch (browser) {
		case "chrome":
			/*
			 * SafariOptions browserOptions = new SafariOptions();
			 * browserOptions.setPlatformName("MacOS Ventura");
			 * browserOptions.setBrowserVersion("16.0"); HashMap<String, Object> ltOptions =
			 * new HashMap<String, Object>(); ltOptions.put("username", "earthtestleaf");
			 * ltOptions.put("accessKey",
			 * "gfoO71KjXvxNmNtdHXqGV4trP9l1cllYImWNIdQmHcCTsAFC1Y"); ltOptions.put("build",
			 * "Test Manager"); ltOptions.put("project", "Salesforce"); ltOptions.put("w3c",
			 * true); browserOptions.setCapability("LT:Options", ltOptions); URL url = new
			 * URL(
			 * "https://earthtestleaf:gfoO71KjXvxNmNtdHXqGV4trP9l1cllYImWNIdQmHcCTsAFC1Y@hub.lambdatest.com/wd/hub"
			 * );
			 */
			remoteWebdriver.set( new ChromeDriver());
			break;
		case "firefox":
			remoteWebdriver.set(new FirefoxDriver());
			break;
		case "edge":
			remoteWebdriver.set(new EdgeDriver());
			break;	
		case "ie":
			remoteWebdriver.set(new InternetExplorerDriver());
		default:
			break;
		}
	}
	public RemoteWebDriver getDriver() {
		return remoteWebdriver.get();
	}
	
	
	
	
	
}
