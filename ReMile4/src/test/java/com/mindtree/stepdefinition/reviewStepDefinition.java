package com.mindtree.stepdefinition;


//import org.junit.runner.RunWith;


import com.mindtree.pageObjects.reviewObject;
import com.mindtree.reusableComponents.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.junit.Cucumber;
import junit.framework.Assert;

//@RunWith(Cucumber.class)
public class reviewStepDefinition extends Base {

    @Given("^Navigate to Bounty website$")
    public void navigate_to_bounty_website() throws Exception  {
    	driver=initializer();
    	driver.get(prop.getProperty("url"));
    	
    
    }
        

    @When("^Click on Essentials Select\\-A\\-Size in Footer$")
    public void click_on_essentials_selectasize_in_footer()  {
    	reviewObject r=new reviewObject(driver);
    	r.footer().click();
    	boolean dat=r.checkr().isDisplayed();
    	Assert.assertEquals(true, dat);
        
    }

    @Then("^Verify if we have the link “Write a review”$")
    public void verify_if_we_have_the_link_write_a_review() {
    	driver.close();
        
    }

}
