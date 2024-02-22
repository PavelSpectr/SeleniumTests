package org.spectr;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Authorization authorization;

        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com");

        String title = driver.getTitle();

        System.out.println(title);

        WebElement link = driver.findElement(By.linkText("Basic Auth"));

        System.out.println(link);

        //link.click();

        driver.get("https://the-internet.herokuapp.com/basic_auth");
        Cookie getCookie = new Cookie("optimizelyEndUserId", "oeu1708499076608r0.4818254838845215");
        driver.manage().addCookie(getCookie);

        //WebElement input = driver.findElement(By.id("login"));
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
//        WebElement textBox = driver.findElement(By.name("my-text"));
//        WebElement submitButton = driver.findElement(By.cssSelector("button"));
//        textBox.sendKeys("Selenium");
//        submitButton.click();
//        message.getText();
          sleep(10000);
          driver.quit();
    }
}