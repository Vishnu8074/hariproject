package com.mindtree.stepdefinition;

import org.apache.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import org.junit.runner.RunWith;




import com.mindtree.pageObjects.paperObject;
import com.mindtree.reusableComponents.Base;
import com.mindtree.reusablecomponents.WebdriverHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.junit.Cucumber;
import junit.framework.Assert;

//@RunWith(Cucumber.class)
public class pastepdefinition extends Base {
	public static Logger log=(Logger) LogManager.getLogger(Base.class.getName());

    @Given("^Navigate to Bounty website $")
    public void navigate_to_bounty_website() throws Exception  {
    	driver=initializer();
    	driver.get(prop.getProperty("url"));
        
    }

    @When("^seerched for (.+)$")
    public void seerched_for(String name)  {
    	paperObject po=new paperObject(driver);
    	po.search().click();
    	po.input().sendKeys(name);
    	po.searchbutton().click();
    	String data=po.verifytext().getText();
    	if(data.contains("RESULTS FOR 'PAPER'"))
    	{
    		System.out.println("response correct");
    		log.info("correct");
    	}
    	else
    	{
    		System.out.println("verification invalid");
    		log.info("incorrect");
    	}
    	
       
    }

    @Then("^Result for paper is present$")
    public void result_for_paper_is_present()  {
    	driver.close();
       
    }

}