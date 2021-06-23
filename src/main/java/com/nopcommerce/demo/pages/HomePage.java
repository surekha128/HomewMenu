package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import java.util.List;

/*
Write the following Test:
1.Test name verifyProductArrangeInAlphaBaticalOrder()
	1.1 Click on Computer Menu.
	1.2 Click on Desktop
	1.3 Select Sort By position "Name: Z to A"
	1.4 Verify the Product will arrange in Descending order.

2. Test name verifyProductAddedToShoppingCartSuccessFully()
	2.1 Click on Computer Menu.
	2.2 Click on Desktop
	2.3 Select Sort By position "Name: A to Z"
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
/*
1. create class "TopMenuTest"
 	1.1 create method with name "selectMenu" it has one parameter name "menu" of  type string
	1.2 This method should click on the menu whatever name is passed as parameter.
	1.3. create the @Test method name verifyPageNavigation.use selectMenu method to select the Menu and click on it and verify the page navigation.

 */
public class HomePage extends Utility {

    By computer = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]");

    public void clickonmenucomputer(){
        Reporter.log("Clicking on computer " + computer.toString() + "<br>");
        clickOnElement(computer);

    }

}
