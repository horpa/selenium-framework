package hu.virgo.selenium.framework.page;

import hu.virgo.selenium.framework.page.verify.ElementVerifier;
import hu.virgo.selenium.framework.page.verify.PageVerifier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {

	protected final WebDriver driver;

	public Page(WebDriver driver, By element) {
		this(driver, new ElementVerifier(element));
	}

	public Page(WebDriver driver, PageVerifier verifier) {
		this.driver = driver;
		verifier.verify(driver);
	}

}