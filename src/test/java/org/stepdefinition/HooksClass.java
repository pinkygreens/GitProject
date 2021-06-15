package org.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass {
	@Before
	public void beforeScenario() {
		System.out.println("It will execute before each scenario");
	}
	@After
	public void afterScenario() {
		System.out.println("It will execute after completion of each scenario");
	}
	@Before("@smoke")
	public void beforeScenario1() {
		System.out.println("It will execute before smoke tag");
	}
	@After("@smoke")
	public void afterScenario1() {
		System.out.println("It will execute after completion of smoke tag");
	}
	@Before("@reg")
	public void beforeScenario2() {
		System.out.println("It will execute before reg tag");
	}
	@After("@reg")
	public void afterScenario2() {
		System.out.println("It will execute after completion of reg tag");
	}
	@Before("@sanity")
	public void beforeScenario3() {
		System.out.println("It will execute before sanity tag");
	}
	@After("@sanity")
	public void afterScenario3() {
		System.out.println("It will execute after completion of sanity tag");
	}
	@Before("@E2E")
	public void beforeScenario4() {
		System.out.println("It will execute before E2E tag");
	}
	@After("@E2E")
	public void afterScenario4() {
		System.out.println("It will execute after completion of E2E tag");
	}


}
