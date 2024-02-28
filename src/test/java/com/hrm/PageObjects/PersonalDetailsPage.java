package com.hrm.PageObjects;

import com.hrm.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPage extends BaseClass {
    public PersonalDetailsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='orangehrm-edit-employee-name']")
    WebElement lbl_empname_personalDetail;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement emp_fullname;

    public String gettext_lbl_empname()
    {
        return lbl_empname_personalDetail.getText();
    }

    public String gettext_emp_fullname()
    {
        return emp_fullname.getText();
    }


}
