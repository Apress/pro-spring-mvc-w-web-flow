package com.apress.prospringmvc.bookstore.web.frontend;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLoginFrontendTest {

    private WebDriver browser;

    @Before
    public void setup() {
        browser = new FirefoxDriver();
    }

    @Test
    public void startTest() {
        browser.get("http://localhost:8080/chapter9-bookstore/");

        browser.findElement(By.id("login")).click();

        // Will throw exception if elements not found
        browser.findElement(By.id("username")).sendKeys("jd");
        browser.findElement(By.id("password")).sendKeys("secret");

        browser.findElement(By.id("loginButton")).click();
        browser.findElement(By.id("account")).click();

        assertEquals("John", browser.findElement(By.id("firstName")).getAttribute("value"));
    }

    @After
    public void tearDown() {
        browser.close();
    }
}
