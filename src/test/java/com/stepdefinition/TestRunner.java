package com.stepdefinition;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/Customerdata.feature",
                 glue= "com.stepdefinition",
                 plugin= {"html:target","json:target/report.json"},
		         dryRun=false,
                 monochrome=true)

public class TestRunner {

}
