package com.mindtree.stepdefinition;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;


import com.mindtree.pageObjects.tipsObject;
import com.mindtree.reusableComponents.Base;

//@RunWith(Cucumber.class)
public class tipsStepdefinition extends Base {

    @Given("^Navigate to Bounty website$")
    public void navigate_to_bounty_website() throws Exception  {
    	driver=initializer();
    	driver.get(prop.getProperty("url"));
        
    }

    @When("^Click on Essentials Select\\-A\\-Size in Footer$")
    public void click_on_essentials_selectasize_in_footer() throws InterruptedException  {
    	tipsObject re=new tipsObject(driver);
    	re.tipsbuuton().click();
    	Thread.sleep(500);
    	boolean va=re.validate().isDisplayed();
    	Assert.assertEquals(true, va);
    	
        
    }

    @Then("^Verify if we have the link “Write a review”$")
    public void verify_if_we_have_the_link_write_a_review()  {
    	driver.close();
       
    }

}