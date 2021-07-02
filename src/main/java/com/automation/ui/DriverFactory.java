package com.automation.ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.springframework.stereotype.Component;

/**
 * @author Maheswara
 * @created on 30/06/21
 */
@Component
public class DriverFactory {

    public WebDriver getChromeDeriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public WebDriver getFirefoxDeriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    public WebDriver getSafariDriver() {
        WebDriverManager.phantomjs().setup();
        return new SafariDriver();
    }
    public WebDriver getIEDriver() {
        WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }
}
