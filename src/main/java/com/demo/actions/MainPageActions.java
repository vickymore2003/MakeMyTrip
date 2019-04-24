package com.demo.actions;

import org.openqa.selenium.WebElement;
import com.demo.locators.MainPageLocators;

public class MainPageActions extends Baseclass {
	MainPageLocators locators = new MainPageLocators();

	public void roundTrip(String to, String from) throws InterruptedException {
		String To = to, From = from;
		WebElement roundTrip = driver.findElement(locators.roundTripBtn);
		roundTrip.click();

		WebElement FromCity = driver.findElement(locators.FromCityName);
		FromCity.sendKeys(To);
		FromCity.findElement(locators.ToCityDD);

		WebElement ToCity = driver.findElement(locators.ToCityName);
		ToCity.sendKeys(From);
		ToCity.findElement(locators.FromCityDD);
	}
}
