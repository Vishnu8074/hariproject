package com.mindtree.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src\\test\\java\\features",
		glue="com.mindtree.stepdefinition")

public class trunner extends AbstractTestNGCucumberTests {

}
