package com.mindtree.runner;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)

@CucumberOptions(
		features="src\\test\\java\\features",
		glue="stepdefinition")

public class testrun extends AbstractTestNGCucumberTests
{

}
