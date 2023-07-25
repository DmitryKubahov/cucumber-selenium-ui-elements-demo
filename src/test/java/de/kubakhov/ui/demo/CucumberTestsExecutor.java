package de.kubakhov.ui.demo;

import io.cucumber.junit.platform.engine.Constants;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

/**
 * Cucumber tests executor to be able to run with junit5.
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(
        key = Constants.PLUGIN_PROPERTY_NAME,
        value = "html:build/cucumber-reports/Cucumber.html"
)
@SpringBootTest(classes = CucumberTestsExecutor.CucumberTestsConfiguration.class)
@CucumberContextConfiguration
public class CucumberTestsExecutor {

    @ComponentScan(basePackageClasses = CucumberTestsExecutor.class)
    public static class CucumberTestsConfiguration { }
}
