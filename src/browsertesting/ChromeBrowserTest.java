package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Launch URL
        driver.get(baseUrl);

        //Maximize window
        driver.manage().window().maximize();

        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the page
        System.out.println("Page title is : " + driver.getTitle());

        //print the current url
        System.out.println("Current url is : " + driver.getCurrentUrl());

        //print the page source
        System.out.println("Page source is : " + driver.getPageSource());

        //Enter email in email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("prime123@gmail.com");

        //Enter password in password field
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("prime123");

        //close driver
        driver.close();
    }
}
