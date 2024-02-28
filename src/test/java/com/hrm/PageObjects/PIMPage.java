package com.hrm.PageObjects;

import com.hrm.Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PIMPage extends BaseClass {


    public PIMPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Add Employee']")
    WebElement add_employee_xpath;

    @FindBy(xpath = "//a[text()='Employee List']")
    WebElement employee_list_xpath;

    @FindBy(xpath = "//span[text()='Configuration ']")
    WebElement configuration_xpath;

    @FindBy(xpath = "//span[text()='Configuration ']/i")
    WebElement config_dropdown_xpath;

    @FindBy(xpath = "//ul[@class='oxd-dropdown-menu']")
    List<WebElement> dropdown_Items;

    public void click_AddEmployee()
    {
        add_employee_xpath.click();
    }

    public void click_EmployeeList()
    {
        employee_list_xpath.click();
    }

    public void click_configuration()
    {
        configuration_xpath.click();
    }

    public void click_config_dropdown(){
        config_dropdown_xpath.click();
    }

    public void click_dropdown_Items(String req_config_dropdownItem){

        for(WebElement ele: dropdown_Items)
        {
            if(ele.getText().equals(req_config_dropdownItem))
            {
                ele.click();
                break;
            }
        }
    }





}
