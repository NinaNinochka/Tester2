package com.Runners.Java;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/features"}
,glue = {"com/StepsDefenitions"}
,monochrome=true
,plugin= {"html:target/cucumber-default-reports" 
		 , "json:target/cucumber.json"}
,dryRun=false)	
	
	
	public class Run1 {	
	
}
                     