package com.hrm.PageObjects;

import com.hrm.Base.BaseClass;
import com.hrm.Utitlies.ReadConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{



    public LoginPage(){



        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "username")
    WebElement username;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;
    @FindBy(xpath = "//div[@class='orangehrm-login-forgot']")
    WebElement forgotPasswordLink;


    public void verifyLogin(String user, String pwd)
    {
        username.sendKeys(user);
        password.sendKeys(pwd);
        submit.click();
    }

    public void verifyForgotPasswordLink()
    {

        forgotPasswordLink.click();
    }


}
