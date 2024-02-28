package com.hrm.TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Testing {





    public static void main(String[] args)throws Exception{
         String FilePath = "C:\\Users\\Suhas\\OrangeHRMAutomationwithType2\\src\\test\\resources\\config.properties";
         FileInputStream fis = new FileInputStream(FilePath);

         Properties proper = new Properties();
         proper.load(fis);

         System.out.println(proper.getProperty("username"));
        System.out.println(proper.getProperty("password"));
        System.out.println(proper.getProperty("template"));
        System.out.println(proper.getProperty("browser"));
    }













}
