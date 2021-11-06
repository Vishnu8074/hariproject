package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
//import io.cucumber.junit.Cucumber;
//import org.junit.runner.RunWith;

import com.mindtree.pageobject.Loginpage;
import com.mindtree.reusablecomponents.WebdriverHelper;

//@RunWith(Cucumber.class)
public class Stepdefinition extends WebdriverHelper {

    @Given("^navigate to google$")
    public void landing_in_the_homepage() throws Throwable {
    	driver=initializer();
    	
    	
       
    }
    @And("^navigate to \"([^\"]*)\" website$")
    public void navigate_to_something_website(String strArg1) throws Throwable {
    	driver.get(strArg1);
       
    }

    @And("^navigate to login and click$")
    public void navigate_to_login_and_click() throws Throwable {
    	Loginpage lp=new Loginpage(driver);
		  lp.login().click();
        
    }

    @When("^given user input for userid (.+) and pasw (.+)$")
    public void given_user_input_for_userid_and_pasw(String username, String password) throws Throwable {
    	Loginpage lp=new Loginpage(driver);
    	lp.email().sendKeys(username);
		  lp.password().sendKeys(password);

    }


    @Then("^dont know still$")
    public void dont_know_still() throws Throwable {
    	System.out.println("did ot know still its like a vanilla test");
       
    }
    
    @And("^close the driver$")
    public void close_the_driver()throws Throwable{
    	System.out.println("close this vanilla test");
    	driver.close();
    }



}