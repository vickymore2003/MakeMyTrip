package com.demo.locators;

import org.openqa.selenium.By;

public class MainPageLocators {
	public By roundTripBtn = By.xpath("//li[text()='Round Trip']");
	public By FromCityDD = By.xpath("//p[contains(text(),'Delhi')]/ancestor::li[@role = 'option']");
	public By FromCityName = By.xpath("//input[@id='fromCity']");
	public By ToCityDD = By.xpath("//p[contains(text(),'Bangalore')]/ancestor::li[@role = 'option']");
	public By ToCityName = By.xpath("//input[@id='toCity']");

}
