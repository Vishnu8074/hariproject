package stepdefinition;




import org.junit.runner.RunWith;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.pageobjects.Products;
import com.mindtree.reusablecomponent.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepdefinition extends Base {
	

    @Given("^Load website$")
    public void load_website() throws Throwable {
        
        driver=initializer();
        driver.get(prop.getProperty("url"));
    }

    @When("^Hover on Shop Products from top navigation$")
    public void _hover_on_shop_products_from_top_navigation() throws Throwable {
    	Products p=new Products(driver);
    	
		Actions action = new Actions(driver);
		WebElement shop1=p.shopproduct();
		Thread.sleep(100);
		
		action.moveToElement(shop1).perform();
		
        
    }

    @Then("^Verify if the Tide Free and Gentle powder is listed in 5 products list$")
    public void verify_if_the_tide_free_and_gentle_powder_is_listed_in_5_products_list() throws Throwable {
    	
    	Products p=new Products(driver);
    	Assert.assertEquals(true, p.detergent().isDisplayed());
        
    }

    @And("^Choose powder from the drop-down$")
    public void choose_powder_from_the_dropdown() throws Throwable {
    	Products p=new Products(driver);
    	p.powder().click();
      
    }

}
