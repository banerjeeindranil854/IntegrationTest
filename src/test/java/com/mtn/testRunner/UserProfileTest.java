package com.mtn.testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features="src/test/resources/features",
        glue= {"com.mtn.stepDefinitions"},
        plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber.json"},
        monochrome = true
        )
public class UserProfileTest extends AbstractTestNGCucumberTests {
        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios(){
            return super.scenarios();
        }
}
