package com.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;

@CucumberOptions(
		features= {"src/main/java/com/featureFiles"} 
		,glue= "steps"
		,dryRun = false 
		,monochrome = true
		,tags = {"@SmokeTest"}
		)
public class FacebookRunner extends AbstractTestNGCucumberTests/*CustomAbstractTestNGCucumberTests*/{
	
@Override
	public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) throws Throwable {
		System.out.println(pickleWrapper.toString());
		System.out.println(featureWrapper.toString());
		super.runScenario(pickleWrapper, featureWrapper);
	}

	
}







