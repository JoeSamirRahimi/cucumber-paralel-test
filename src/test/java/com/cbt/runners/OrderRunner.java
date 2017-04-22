package com.cbt.runners;


import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format={"html:target/cucumber-report/order",
				"json:target/cucumber-report/order/cucumber.json"},
		features = "./src/test/resources/features/",
		glue = "./com/cbt/stepdefs"
		)

public class OrderRunner {

}
