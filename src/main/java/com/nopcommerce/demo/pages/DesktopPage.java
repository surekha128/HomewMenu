package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
1.2 Click on Desktop
	1.3 Select Sort By position "Name: Z to A"
	1.4 Verify the Product will arrange in Descending order.
 */
public class DesktopPage extends Utility {

    By sortByZtoA = By.xpath("//select[@id='products-orderby']");
    By clickNameZtoA = By.xpath("//option[contains(text(),'Name: Z to A')]");

    public void mousehoveronsortby() throws InterruptedException {
        Thread.sleep(3000);
         mouseHoverToElement(sortByZtoA);
        clickOnElement(clickNameZtoA);

        //sort by position "Name: Z to A"
        Reporter.log("Clicking on computer " + sortByZtoA.toString() + "<br>");
        Reporter.log("Clicking on computer " + clickNameZtoA.toString() + "<br>");


        selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"), "Name: Z to A");
        //Getting list of web elements of product name
        List<WebElement> deskTopList = driver.findElements(By.xpath("//div[@class='item-grid']"));

        List<String> productName = new ArrayList<>();
        for (WebElement desktop : deskTopList) {
            productName.add(desktop.getText());

            List<String> templist = new ArrayList<>();  // temporary array list
            templist.addAll(productName);


            Collections.sort(templist, Collections.<String>reverseOrder());  // Collections.sort(templist); for Asc only
            System.out.println(productName);
            System.out.println(templist);

            Assert.assertEquals(productName, templist);
        }
    }


}
