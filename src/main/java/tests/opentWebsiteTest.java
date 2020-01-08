package tests;

import cucumber.api.java.en.Given;
import runner.TestRunner;

public class opentWebsiteTest {
    @Given("^I opent website (.*)$")
    public void opentWebsite(String website) throws InterruptedException {
        Thread.sleep(3000);
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();
        Thread.sleep(3000);
    }
}
