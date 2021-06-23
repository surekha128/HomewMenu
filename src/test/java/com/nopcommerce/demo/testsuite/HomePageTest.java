package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.DesktopsortbyAtoZ;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    DesktopsortbyAtoZ desktopsortbyAtoZ = new DesktopsortbyAtoZ();


    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        homePage.clickonmenucomputer();
        computerPage.clickoncomputer();
        computerPage.clickondesktop();
        desktopPage.mousehoveronsortby();
    }


}
