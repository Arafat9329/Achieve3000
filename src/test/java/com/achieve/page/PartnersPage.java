package com.achieve.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.achieve.utils.BrowserUtilities.*;

public class PartnersPage extends BasePage {

    @FindBy (xpath = "//nav[@id='main-navbar']//button[@class='navbar-toggler collapsed']")
    private WebElement hamburgerMenu;

    @FindBy (xpath = "//div[@class='main-navigation']//a[.='Our Partners']")
    private WebElement hamburgerMenu_OurPartners;

    @FindBy (xpath = "//main//div[2][@class='container']/div[@class='row h-100 ']//img")
    private List<WebElement> listLogo;

    @FindBy (xpath = "//main//div[2][@class='container']/div[@class='row h-100 ']//h3")
    private List<WebElement> listHeader;

    @FindBy (xpath = "//main//div[2][@class='container']/div[@class='row h-100 ']//p")
    private List<WebElement> listDescription;

    public void clickHamburgerMenu(){
        waitClickOnElement(hamburgerMenu);
    }

    public void clickHamburgerMenu_OurPartners(){
        waitClickOnElement(hamburgerMenu_OurPartners);
    }

    public List<WebElement> getListOfLogo(){
        return listLogo;
    }

    public List<WebElement> getListOfHeader(){
        return listHeader;
    }

    public List<WebElement> getListOfDescription(){
        return listDescription;
    }
}
