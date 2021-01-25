package com.achieve.tests;

import com.achieve.page.PartnersPage;
import com.achieve.utils.Driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestPartnerPage extends AbstractTestBase{

    PartnersPage partnersPage = new PartnersPage();

    @Test
    public void verifyAllPresentedPartnersHas_Logo_Header_TextDescription() {

        //open https://www.achieve3000.com
        Driver.getDriver().get("https://www.achieve3000.com");

        //click hamburger menu in top right corner
        partnersPage.clickHamburgerMenu();

        //open Our Partners from the list
        partnersPage.clickHamburgerMenu_OurPartners();

        //List all partners logo
        List<WebElement> listOfLogo = partnersPage.getListOfLogo();

        //check all presented partners has logo, header and text description
        for (int i = 0; i < listOfLogo.size(); i++) {
            Assert.assertTrue(partnersPage.getListOfLogo().get(i).isDisplayed());
            Assert.assertTrue(partnersPage.getListOfHeader().get(i).isDisplayed());
            Assert.assertTrue(partnersPage.getListOfDescription().get(i).isDisplayed());
        }

    }


}
