package utilities;

import browesertesting.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    /**
     * THis method will click on element
     */
    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();


    }

    public void sendTextToElement(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }

    public String getTextFromElement(By by) {
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }
    /*This method will send on element
     */


    /**
     * This method will switch to alert
     */
    public void switchToAlert() {

        driver.switchTo().alert();
    }
    //Homework 4 method acceptAlert,dismissAlert, getTextFromAlert, sendtoAlert(String text)
    //******* Select class Methods**********************


    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        //Select By value
        select.selectByVisibleText(text);
        // in hw create othe 2 method Index &....

        /*/**
         * This method will select the option by value
         */

        /**
         * This method will select the option by index
         */

        /**
         * This method will select the option by contains text
         */
//***************** Window handle***************
        //****************** Action Class**************
//mouseHoverToElementAndClick(By by)
    }
}




