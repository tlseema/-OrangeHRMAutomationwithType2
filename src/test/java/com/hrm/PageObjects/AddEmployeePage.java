package com.hrm.PageObjects;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.hrm.Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage extends BaseClass {


    public AddEmployeePage() {

        PageFactory.initElements(driver,this);
    }

    //Webelement locators

    @FindBy(name="firstName")
    WebElement txtempFirstName;

    @FindBy(name="middleName")
    WebElement txtempMiddleName;

    @FindBy(name="lastName")
    WebElement txtempLastName;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement chkboxCreateLoginDetails;

    @FindBy(xpath = "(//*[contains(text(),'Username')]//following::div//input)[1]")
    WebElement txtUsername;

    @FindBy(xpath = "//input[@value='1']")
    WebElement statusEnable;

    @FindBy(xpath = "//input[@value='2']")
    WebElement statusDisable;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement txtPassword;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement txtConfirmPassword;

    @FindBy(xpath = "//button[text()=' Cancel ']")
    WebElement btnCancel;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSave;

    public void entertxt_firstName(String empfname)
    {
        txtempFirstName.sendKeys(empfname);
    }

    public void entertxt_MiddleName(String mname)
    {
        txtempMiddleName.sendKeys(mname);
    }

    public void entertxt_LastName(String lname)
    {
        txtempLastName.sendKeys(lname);
    }
    public void click_btnSave()
    {
        btnSave.click();
    }

}
