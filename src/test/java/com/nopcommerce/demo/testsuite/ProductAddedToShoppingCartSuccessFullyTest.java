package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductAddedToShoppingCartSuccessFullyTest extends TestBase {

    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    DesktopsortbyAtoZ desktopsortbyAtoZ = new DesktopsortbyAtoZ();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();




    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickonmenucomputer();
        computerPage.clickoncomputer();
        computerPage.clickondesktop();
        desktopsortbyAtoZ.getsortingpositionNameAtoZ();
        buildYourOwnComputer.addtocartclick();
        buildYourOwnComputer.buildyourowncomputerproductselectprocessor("2");//choose 1 or 2
        buildYourOwnComputer.buildyourowncomputerproductselectram("5");//choose 3 or 4 or 5
        buildYourOwnComputer.buildyourowncomputerproductselectHDD("7");//6 or 7
        buildYourOwnComputer.selectOS("9");//choose 8 or 9
        buildYourOwnComputer.selectSoftware("12");//choose 10 or 11 or 12
        buildYourOwnComputer.clickoOnADDTOCARD();





    }
}
