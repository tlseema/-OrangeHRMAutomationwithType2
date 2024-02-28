package com.hrm.Base;

import com.hrm.Utitlies.ReadConfig;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import io.github.bonigarcia.wdm.WebDriverManager;

//**
//* @author: Seema
//* BaseClass is for initialization
public class BaseClass {

    ReadConfig readConfig = new ReadConfig();
    String url = readConfig.getBaseUrl();
    //String browser = readConfig.getBrowser();
    //public String emailAddress = readConfig.getEmail() ;
    String password = readConfig.getPassword();

    //String implicitWait = readConfig.getimplicitWait();
    //String pageLoadTimeOut = readConfig.getpageLoadTimeOut();



    public static WebDriver driver;
    public static Logger logger = LogManager.getLogger(BaseClass.class);

    @BeforeMethod
    @Parameters({"browser"})
    public void setup(String browser)
    {
        switch(browser.toLowerCase()) {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                options.setPageLoadStrategy(PageLoadStrategy.NONE);
                driver = new ChromeDriver(options);
                break;

            case "msedge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                driver = null;
                break;
        }


        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        //Maximize the screen
        driver.manage().window().maximize();
        //Delete all the cookies
        driver.manage().deleteAllCookies();
        //Implicit TimeOuts
        //driver.manage().timeouts().implicitlyWait(Integer.parseInt(implicitWait),TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        //PageLoad TimeOuts
        //driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(pageLoadTimeOut),TimeUnit.SECONDS);

        //Launching the URL
        driver.get(readConfig.getBaseUrl());
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

        //for logging
        logger = LogManager.getLogger(BaseClass.class);


        logger.info("url opened");

    }

    @AfterMethod
    public void teardown()
    {
        driver.quit();
        //driver.quit();
    }



}
