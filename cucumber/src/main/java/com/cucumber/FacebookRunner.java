package com.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/main/java/com/featureFiles"}, 
		glue= "steps"
		,dryRun = false 
		,monochrome = true
//		,tags = {"~ @SmokeTest"}
		)
public class FacebookRunner extends AbstractTestNGCucumberTests/*CustomAbstractTestNGCucumberTests*/{
	
	
}







