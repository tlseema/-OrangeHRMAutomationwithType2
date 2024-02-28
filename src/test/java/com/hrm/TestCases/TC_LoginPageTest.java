package com.hrm.TestCases;


import com.hrm.Base.BaseClass;
import com.hrm.PageObjects.IndexPage;
import com.hrm.PageObjects.LoginPage;
import com.hrm.Utitlies.Log;
import com.hrm.Utitlies.ReadConfig;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_LoginPageTest extends BaseClass {

    public ReadConfig readConfig;
    public LoginPage loginpage;

    public IndexPage indexpage;

    @Test(priority = 1)
    public void VerifyloginisSuccessful()
    {
        readConfig = new ReadConfig();
        loginpage = new LoginPage();
        Log.startTestCase("loginTest");
        loginpage.verifyLogin(readConfig.getUsername(), readConfig.getPassword());
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
        logger.info("Login is successful");
    }

    // @Test(priority = 1)
    public void VerifyForgotPasswordLink()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoginPage loginpage = new LoginPage();


        loginpage.verifyForgotPasswordLink();
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode");
           }

}
