
package com.mindtree.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//import org.junit.runner.RunWith;


//import cucumber.api.testng.AbstractTestNGCucumberTests;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\features",
		glue="stepdefinitions")

public class testrunn extends AbstractTestNGCucumberTests
{

}

