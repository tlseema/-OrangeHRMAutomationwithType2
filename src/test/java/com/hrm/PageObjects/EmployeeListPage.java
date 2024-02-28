package com.hrm.PageObjects;

import com.hrm.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeListPage extends BaseClass {


    public EmployeeListPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
    WebElement txt_searchemployeeName;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchbtn;

    public void entertxt_employeename(String name)
    {
        txt_searchemployeeName.sendKeys(name);
    }

    public void click_searchbutton()
    {
        searchbtn.click();
    }

}
