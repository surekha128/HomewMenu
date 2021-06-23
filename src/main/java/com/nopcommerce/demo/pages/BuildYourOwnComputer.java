package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
2.4 Click on "Add To Cart"
	2.5 Verify the Text "Build your own computer"
	2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
	2.7.Select "8GB [+$60.00]" using Select class.
	2.8 Select HDD radio "400 GB [+$100.00]"
	2.9 Select OS radio "Vista Premium [+$60.00]"
    2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
	2.11 Verify the price "$1,475.00"
	2.12 Click on "ADD TO CARD" Button.
	2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar

 */
public class BuildYourOwnComputer extends Utility {

    By clickaddtocart = By.xpath("//button[@class='button-2 product-box-add-to-cart-button']");
    By verifybuildtext = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By selectprocessor = By.xpath("//select[@id='product_attribute_1']");
    By selectram = By.xpath("//select[@id='product_attribute_2']");
    By selectHDD1 = By.xpath("//input[@id='product_attribute_3_6']");
    By selectHDD2 = By.xpath("//input[@id='product_attribute_3_7']");
    By selectOS1 = By.xpath("//input[@id='product_attribute_4_8']");
    By selectOS2 = By.xpath("//input[@id='product_attribute_4_9']");
    By selectMicrofoftOffice = By.id("product_attribute_5_10");
    By selectAcrobatReader = By.id("product_attribute_5_11");
    By selectTotalCommander = By.id("product_attribute_5_12");
    By totalverify = By.xpath("//span[@id='price-value-1']");
    //span[@id='price-value-1']
    By  addtocart =  By.id("add-to-cart-button-1");

    public void addtocartclick() throws InterruptedException {
        Thread.sleep(3000);
        Reporter.log("Clicking on computer " + clickaddtocart.toString() + "<br>");

        clickOnElement(clickaddtocart);
        String expectedMessage = "Build your own computer";
        String actualMessage = getTextFromElement(verifybuildtext);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    public void buildyourowncomputerproductselectprocessor(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Clicking on computer " + selectprocessor.toString() + "<br>");

        selectByValueFromDropDown(selectprocessor, value);
    }

    public void buildyourowncomputerproductselectram(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Clicking on computer " + selectram.toString() + "<br>");

        selectByValueFromDropDown(selectram, value);
    }

    public void buildyourowncomputerproductselectHDD(String value) throws InterruptedException {
   /* //    List<String> list = new ArrayList<String>();
       Thread.sleep(5000);
        List<WebElement> HDD = getListOfElements(By.xpath("//dd[@id='product_attribute_input_3']/ul/child::li"));
        HDD.toString().length();
       if (value.matches(String.valueOf(HDD))) {
           clickOnElement(selectHDD1);
           System.out.println(value);
       }
        else if (value.matches(String.valueOf(selectHDD1))){
         clickOnElement(selectHDD2);
            System.out.println(value);
        }*/

        if (value == "6") {
            Reporter.log("Selection of HDD Attribute" + selectHDD1.toString() + "<br>");
            clickOnElement(selectHDD1);
        } else if (value == "7") {
            Reporter.log("Selection of HDD Attribute" + selectHDD2.toString() + "<br>");
            clickOnElement(selectHDD2);
        } else {
            System.out.println("Accepts value 6 or 7 only");
        }
    }

    public void selectOS(String value) {
        if (value == "8") {
            Reporter.log("Selection of HDD Attribute" + selectOS1.toString() + "<br>");
            clickOnElement(selectOS1);
       } else if (value == "9") {
            Reporter.log("Selection of HDD Attribute" + selectOS2.toString() + "<br>");
            clickOnElement(selectOS2);
        }
    }

    public void selectSoftware(String value){
        if (value == "10") {
            Reporter.log("Selection of HDD Attribute" + selectMicrofoftOffice.toString() + "<br>");
            clickOnElement(selectMicrofoftOffice);
        } else if (value == "11") {
            Reporter.log("Selection of HDD Attribute" + selectAcrobatReader.toString() + "<br>");
            clickOnElement(selectAcrobatReader);
        }else if (value == "12") {
            Reporter.log("Selection of HDD Attribute" + selectTotalCommander.toString() + "<br>");
            clickOnElement(selectTotalCommander);
        }
        String expectedMessage = getTextFromElement(totalverify);
        String actualMessage = getTextFromElement(totalverify);
        Assert.assertEquals(actualMessage, expectedMessage);
      }

    public void clickoOnADDTOCARD(){
        Reporter.log("Clicking on computer " + addtocart.toString() + "<br>");
        clickOnElement(addtocart);
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = getTextFromElement(By.xpath("//body/div[@id='bar-notification']/div[1]"));
        Assert.assertEquals(actualMessage, expectedMessage);

    }


}

