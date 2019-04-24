package com.demo.tests;

import org.testng.annotations.Test;

import com.demo.actions.Baseclass;
import com.demo.actions.MainPageActions;

public class TestMakeMyTrip extends Baseclass {
	MainPageActions searchTrip = new MainPageActions();

	@Test
	public void SearchFlights() throws InterruptedException {
		searchTrip.roundTrip("Delhi","Banglore");
	}
}
