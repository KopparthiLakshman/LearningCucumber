package com.customRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

public class CustomAbstractTestNGCucumberTests {

    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @SuppressWarnings("unused")
    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
    public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) throws Throwable {
        // the 'featureWrapper' parameter solely exists to display the feature file in a test report
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }

    /**
     * Returns two dimensional array of {@link PickleWrapper}s
     * with their associated {@link FeatureWrapper}s.
     *
     * @return a two dimensional array of scenarios features.
     */
    @DataProvider
    public Iterator<Object[]> scenarios() {
    	ArrayList<Object[]> modifiedList = new ArrayList<Object[]>();
        if (testNGCucumberRunner == null) {
//            return new Object[0][0];
        	return modifiedList.iterator();
        }
       	ArrayList<Object[]> privateFilter = privateFilter(testNGCucumberRunner.provideScenarios()); 	
       	return modifiedList.iterator();
    }

    private ArrayList<Object[]> privateFilter(Object[][] data) {
    	List<String> listOfFeature = Arrays.asList("Login into facebook application");
    	ArrayList<Object[]> modifiedList = new ArrayList<Object[]>();
    	
    	if(data != null)
    	{
    		for (int i = 0; i < data.length; i++) {

    			FeatureWrapper featureWrapper = (FeatureWrapper)data[0][i];
    			if(listOfFeature.contains(featureWrapper.toString().trim().replace("\"", "")))
    				{
    					System.out.println("****"+featureWrapper.toString().trim().replace("\"", ""));
    					modifiedList.add(data[i]);
    				}
			}
    	}
    	return modifiedList;
    }
    
    
    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        if (testNGCucumberRunner == null) {
            return;
        }
        testNGCucumberRunner.finish();
    }

}
