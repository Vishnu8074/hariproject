package stepdefinition;

import org.junit.runner.RunWith;

import com.mindtree.pageobjects.Antibacterial;
import com.mindtree.reusablecomponent.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class stepdefinition2 extends Base  {

    @Given("^load google and website$")
    public void load_google_and_website() throws Throwable {
    	driver=initializer();
    	driver.get(prop.getProperty("url"));
       
    }

    @When("^click search and send (.+)$")
    public void click_search_and_send(String name) throws Throwable {
    	Antibacterial a=new Antibacterial(driver);
    	a.search().sendKeys(name);
    	a.button().click();
    	
        
    }

    @Then("^check if it is present$")
    public void check_if_it_is_present() throws Throwable {
    	Antibacterial a=new Antibacterial(driver);
    	Assert.assertEquals(true,a.find().isDisplayed() );
       
    }

    @And("^close the driver$")
    public void close_the_driver() throws Throwable {
    	driver.close();
        
    }

}
