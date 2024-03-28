import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws AWTException {

        System.setProperty("webdrivr.chrome.driver","/home/sgell/chromedriver-linux64/chromdriver");
       String expectedTitle = "Mail.bg: Вход";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.bg/auth/lgn");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        // login (written test case)
        WebElement username = driver.findElement(By.id("imapuser"));
        username.isDisplayed();
        username.isEnabled();
        username.sendKeys("teeestt@mail.bg");

         WebElement password = driver.findElement(By.id("pass"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("12345678Ag");

        WebElement signOnButton = driver.findElement(By.xpath("//a[contains(text(),'ВЛЕЗ')]"));
        signOnButton.isDisplayed();
        signOnButton.isEnabled();
        signOnButton.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        // entering email address field
        WebElement emailField = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/div[5]/div[2]/span[1]/a[1]"));
        emailField.isDisplayed();
        emailField.isEnabled();
        emailField.click();
      //  emailField.sendKeys("new@test.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        // email address field
        WebElement emailField1 = driver.findElement(By.id("to_input"));
        emailField1.isDisplayed();
        emailField1.isEnabled();
        emailField1.click();
        emailField1.sendKeys("test@test.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //email subject
        WebElement subject = driver.findElement(By.cssSelector("#subject > div > div > input"));
        subject.isDisplayed();
        subject.isEnabled();
        subject.click();
        subject.sendKeys("test");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

      //  email text
        WebElement messageField = driver.findElement(By.cssSelector("#message_html_text"));
        messageField.isDisplayed();
        messageField.isEnabled();
        messageField.sendKeys("test,test,test,test");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        // press send button

        WebElement sendButton = driver.findElement(By.id("lower_send_message"));
        sendButton.isDisplayed();
        sendButton.isEnabled();
        sendButton.click();







































        

















    }
}
