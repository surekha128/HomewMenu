package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

/*
2.3 Select Sort By position "Name: A to Z"

 */
public class DesktopsortbyAtoZ extends Utility {

    By sortby = By.id("products-orderby");
    By SortBypositionNameAtoZ = By.xpath("//option[contains(text(),'Name: A to Z')]");


    public void getsortingpositionNameAtoZ() throws InterruptedException {
        Thread.sleep(3000);
        Reporter.log("Clicking on computer " + sortby.toString() + "<br>");

        Reporter.log("Clicking on computer " + SortBypositionNameAtoZ.toString() + "<br>");

        mouseHoverToElement(sortby);
        clickOnElement(SortBypositionNameAtoZ);
    }
}
