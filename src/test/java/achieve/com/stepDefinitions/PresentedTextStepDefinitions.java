package achieve.com.stepDefinitions;

import achieve.com.page.PartnersPage;
import achieve.com.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class PresentedTextStepDefinitions {

    PartnersPage partnersPage = new PartnersPage();

    @Given("open {string}")
    public void open(String url) {
        System.out.println(url);
        Driver.getDriver().get(url);
    }

    @When("click hamburger menu in top right corner")
    public void click_hamburger_menu_in_top_right_corner() {
     partnersPage.clickHamburgerMenu();
    }

    @Then("open Our Partners from the list")
    public void open_our_partners_from_the_list() {
      partnersPage.clickHamburgerMenu_OurPartners();
    }

    @Then("List all partners logo")
    public void list_all_partners_logo() {

        for (WebElement eachElement:partnersPage.getListOfLogo()) {
            Assert.assertTrue(eachElement.isDisplayed());
        }
        System.out.println("partnersPage.getListLogo().size() = " + partnersPage.getListOfLogo().size());
    }

    @Then("check all presented partners has logo, header and text description")
    public void check_all_presented_partners_has_logo_header_and_text_description() {

        for (int i = 0; i <partnersPage.getListOfLogo().size() ; i++) {
            Assert.assertTrue(partnersPage.getListOfLogo().get(i).isDisplayed());
            Assert.assertTrue(partnersPage.getListOfHeader().get(i).isDisplayed());
            Assert.assertTrue(partnersPage.getListOfDescription().get(i).isDisplayed());
        }

    }


}
