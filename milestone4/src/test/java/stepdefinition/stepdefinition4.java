package stepdefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.mindtree.pageobjects.laundry;
import com.mindtree.reusablecomponent.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepdefinition4 extends Base {

    @Given("^load google and website$")
    public void load_google_and_website() throws Throwable {
    	driver=initializer();
    	driver.get(prop.getProperty("url"));
      
    }

    @When("^hover to how to element $")
    public void hover_to_how_to_element() throws Throwable {
    	
       laundry l=new laundry(driver);

		Actions action = new Actions(driver);
		WebElement hover=l.hover1();
		action.moveToElement(hover).perform();
		Thread.sleep(100);
		l.click1().click();
    }

    @Then("^search for text$")
    public void search_for_text() throws Throwable {
    	laundry l=new laundry(driver);
    	//l.find().isDisplayed();
    	Assert.assertEquals(true,l.find().isDisplayed());
        
    }

    @And("^click on how to laundary$")
    public void click_on_how_to_laundary() throws Throwable {
    	laundry l=new laundry(driver);
    	l.click1().click();
    
    }

    @And("^close driver$")
    public void close_driver() throws Throwable {
    	driver.close();
        
    }

}