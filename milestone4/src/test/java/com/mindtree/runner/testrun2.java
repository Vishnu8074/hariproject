package com.mindtree.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)

@CucumberOptions(
		features="src\\test\\java\\features",
		glue="stepdefinition")

public class testrun2 extends AbstractTestNGCucumberTests{

}
