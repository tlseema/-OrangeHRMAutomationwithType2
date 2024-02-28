package com.hrm.Utitlies;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

    public Properties prop;
    String FilePath = "C:\\Users\\Suhas\\OrangeHRMAutomationwithType2\\src\\test\\resources\\config.properties";

    //String implicitwait;
    public static void main(String args[])
    {

    }
    public ReadConfig(){

        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(FilePath);
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getBaseUrl()
    {
        String baseUrlValue = prop.getProperty("url");

        if (baseUrlValue!=null)
        {
            return baseUrlValue;
        }
        else
        {
            throw new RuntimeException("Url is not specified in config file");
        }
    }

   public String getBrowser()
    {
       String browserValue = prop.getProperty("browser");

       if (browserValue!=null)
       {
           return browserValue;
       }
       else
       {
           throw new RuntimeException("Browser details are not specified in config file");
       }
    }

    public String getUsername()
    {
        String uname = prop.getProperty("username");

        if (uname!=null)
        {
            return uname;
        }
        else
        {
            throw new RuntimeException("User name is not specified in config file");
        }
    }

    public String getPassword()
    {
        String pwd = prop.getProperty("password");

        if (pwd!=null)
        {
            return pwd;
        }
        else
        {
            throw new RuntimeException("Password is not specified in config file");
        }
    }

    public String getempfirstname()
    {
        String empfname = prop.getProperty("empfname");
        System.out.println(empfname);

        if (empfname!=null)
        {
            return empfname;
        }
        else
        {
            throw new RuntimeException("Emp first name is not specified in config file");
        }
    }

    public String getempmiddlename()
    {
        String empmname = prop.getProperty("empmname");
        System.out.println(empmname);

        if (empmname!=null)
        {
            return empmname;
        }
        else
        {
            throw new RuntimeException("Emp middle name is not specified in config file");
        }
    }
    public String getemplastname()
    {
        String emplname = prop.getProperty("emplname");
        System.out.println(emplname);

        if (emplname!=null)
        {
            return emplname;
        }
        else
        {
            throw new RuntimeException("Emp last name is not specified in config file");
        }
    }


}
