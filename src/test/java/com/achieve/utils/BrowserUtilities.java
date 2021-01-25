package com.achieve.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtilities {
    private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    /**
     * Performs a pause
     *
     * @param seconds
     */
    public static void wait(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Waits for element matching the locator to be clickable
     *
     * @param element
     */
    public static void waitClickOnElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    /**
     * Waits for element matching the locator to be visible on the page then click
     *
     * @param element
     */
    public static void waitVisibilityOfElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
