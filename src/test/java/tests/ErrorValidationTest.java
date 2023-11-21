package tests;

import DB.DatabaseConnection;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LandingPage;


import java.sql.*;
import java.time.Duration;
import java.util.Properties;

public class ErrorValidationTest  {

    public WebDriver driver;
    public LandingPage landingPage;
    String name;
    String id;

    @Test
    public void Check_loginValidationWrongPassword() throws SQLException {

        String host = "localhost";
        String port = "1433";
        String username = "root";
        String password = "Azaz123#";

        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Qadbt;user=root;password=Azaz123#;");
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("Select * from Employeeinfo");

        while (resultSet.next()) {
            name = resultSet.getString("name");
            id = resultSet.getString("id");


            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://rahulshettyacademy.com/client");
            landingPage = new LandingPage(driver);
            landingPage.LoginToApplication(name, id);
            // String errorMessage = landingPage.getErrorMessage();
            // Assert.assertEquals("Incorrect email or password.",errorMessage);
            driver.close();
        }

    }









}
