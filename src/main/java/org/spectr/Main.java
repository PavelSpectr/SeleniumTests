package org.spectr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Authorization authorization = new Authorization();

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://" + authorization.getUser() + ":" + authorization.getPass() + "@" + "the-internet.herokuapp.com/basic_auth");

        WebElement result = driver.findElement(By.id("content"));
        String text = result.getText();

        System.out.println(text);

        sleep(10000);
        driver.quit();
    }
}