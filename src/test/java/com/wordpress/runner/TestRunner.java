package com.wordpress.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles",glue={"com.wordpress.runner","com.wordpress.stepdefination"})

public class TestRunner{

}
