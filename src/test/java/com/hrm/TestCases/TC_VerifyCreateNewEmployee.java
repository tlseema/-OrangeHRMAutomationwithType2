package com.hrm.TestCases;

import com.hrm.Base.BaseClass;
import com.hrm.PageObjects.*;
import com.hrm.Utitlies.ReadConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_VerifyCreateNewEmployee extends BaseClass {

    private LoginPage loginpage;
    private ReadConfig readConfig;
    private IndexPage indexpage;
    private PIMPage pimpage;
    private AddEmployeePage addEmployeePage;
    private PersonalDetailsPage personalDetailsPage;

    @Test(priority = 2)
    public void verifycreatenewemployee() throws InterruptedException {
         loginpage = new LoginPage();
         readConfig = new ReadConfig();
         indexpage = new IndexPage();
         pimpage = new PIMPage();

         addEmployeePage = new AddEmployeePage();
         personalDetailsPage = new PersonalDetailsPage();

         loginpage.verifyLogin(readConfig.getUsername(),readConfig.getPassword());
         indexpage.clickpimtab();
         pimpage.click_AddEmployee();
         addEmployeePage.entertxt_firstName(readConfig.getempfirstname());
         addEmployeePage.entertxt_MiddleName(readConfig.getempmiddlename());
         addEmployeePage.entertxt_LastName(readConfig.getemplastname());
         addEmployeePage.click_btnSave();
         Thread.sleep(10000);
         Assert.assertEquals(personalDetailsPage.gettext_lbl_empname(),readConfig.getempfirstname()+" "+readConfig.getemplastname());

    }
}
