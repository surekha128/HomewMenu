package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;


public class ComputerPage extends Utility {

    By computer = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]");
    By desktop = By.xpath("//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]");

    public void clickoncomputer(){
        Reporter.log("Clicking on computer " + computer.toString() + "<br>");
        clickOnElement(computer);
    }

    public void clickondesktop() throws InterruptedException {
        Thread.sleep(3000);
        Reporter.log("Clicking on desktop " + desktop.toString() + "<br>");
        clickOnElement(desktop);
    }




}
