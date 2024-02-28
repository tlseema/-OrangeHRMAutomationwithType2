package com.hrm.TestCases;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.hrm.Base.BaseClass;
import com.hrm.PageObjects.*;
import com.hrm.Utitlies.ReadConfig;
import org.testng.annotations.Test;

public class TC_VerifySearchEmployeeCreated extends BaseClass {
    private LoginPage loginpage;
    private ReadConfig readConfig;
    private IndexPage indexpage;
    private PIMPage pimpage;
    private AddEmployeePage addEmployeePage;

    private EmployeeListPage employeeListPage;


    @Test(priority = 2)
    public void verifysearchemployee()
    {
        loginpage = new LoginPage();
        readConfig = new ReadConfig();
        indexpage = new IndexPage();
        pimpage = new PIMPage();
        employeeListPage = new EmployeeListPage();

        loginpage.verifyLogin(readConfig.getUsername(),readConfig.getPassword());
        indexpage.clickpimtab();

        if(!driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList"))
        {
           pimpage.click_EmployeeList();
        }

        employeeListPage.entertxt_employeename(readConfig.getempfirstname());
        employeeListPage.click_searchbutton();

    }

}
