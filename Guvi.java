package task19;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Guvi extends Main {

    @Test
    public void id()
    {
        //Navigate to url
        chromeDriver.get("https://www.guvi.in/register");

        //locate ID
        WebElement username = chromeDriver.findElement(By.id("name"));
        WebElement email = chromeDriver.findElement(By.id("email"));
        WebElement password = chromeDriver.findElement(By.id("password"));
        WebElement mobile = chromeDriver.findElement(By.id("mobileNumber"));
//        WebElement signup = chromeDriver.findElement(By.id("signup"));
        username.sendKeys("Sowmya Bala");
        email.sendKeys("test123@test.com");
        password.sendKeys("Test@1234");
        mobile.sendKeys("0123456789");
//        signup.click();
    }

    @Test
    public void className() {

        //load url
        chromeDriver.get("https://www.guvi.in/register");

        //cannot do all the fields except signup button
        //because it has same class name
        WebElement signup =chromeDriver.findElement(By.className("signup-btn"));
        signup.click();
    }

    @Test
    public void css() {

        //load url
        chromeDriver.get("https://www.guvi.in/register");

        //locate CssSelector
        WebElement username = chromeDriver.findElement(By.cssSelector("#name"));
        WebElement email = chromeDriver.findElement(By.cssSelector("#email"));
        WebElement password = chromeDriver.findElement(By.cssSelector("#password"));
        WebElement mobile = chromeDriver.findElement(By.cssSelector("#mobileNumber"));
        WebElement signup = chromeDriver.findElement(By.cssSelector("#signup-btn"));
        username.sendKeys("Sowmya Bala");
        email.sendKeys("test123@test");
        password.sendKeys("Test@1234");
        mobile.sendKeys("0123456789");
        signup.click();
    }

    @Test
    public void xpath() {

        //load url
        chromeDriver.get("https://www.guvi.in/register");

        //locate Xpath
        WebElement username = chromeDriver.findElement(By.xpath("//input[@id='name']"));
        WebElement email = chromeDriver.findElement(By.xpath("//input[@id='email']"));
        WebElement password = chromeDriver.findElement(By.xpath("//input[@id='password']"));
        WebElement mobile = chromeDriver.findElement(By.xpath("//input[@id='mobileNumber']"));
        WebElement signup = chromeDriver.findElement(By.xpath("//a[@id='signup-btn']"));
        username.sendKeys("Sowmya Bala");
        email.sendKeys("test123@test.com");
        password.sendKeys("Test@1234");
        mobile.sendKeys("0123456789");
        signup.click();
    }
}
