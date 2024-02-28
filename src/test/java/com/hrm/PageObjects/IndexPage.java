package com.hrm.PageObjects;

import com.hrm.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IndexPage extends BaseClass {



    public IndexPage(){

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//ul/li/a/span")
    List<WebElement> listElement;

    @FindBy(xpath="//span[text()='PIM']")
    WebElement pimtab;


    public void verifyIndexPageTitle()
    {
        driver.getTitle();
    }
    public void clickpimtab()
    {
        pimtab.click();
    }
}
