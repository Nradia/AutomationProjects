package expediaProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ExpediaBookingFlight {
	
	WebDriver driver;
	HomeExp home=new HomeExp(driver);
	CheckOutExp checkout=new CheckOutExp(driver);
	SelectFlight flightS=new  SelectFlight(driver);
	BookingInfo b=new BookingInfo(driver);
	
			@Test
  public void f() {
	home.flightbuttonClick();
	home.departureFiled();
	home.departureActual();
	home.departureFiled();
	home.departureActual();
	home.searchButton();
	flightS.flightSelectedClick();
	flightS.departSelectButtonClick();
	checkout.checkoutButtonClick();
	b.firstNameFiedl();
	b.middleNameFiedl();
	b.lastNameFiedl();
	b.country();
	b.phoneFiedl();
	b.genderClick();
	b.dObMonth();
	b.dayObMonth();
	b.yearObMonth();
	b.flightInsurance();
	b.nameOncardField();
	b.creditCardNumberField();
	b.cardExpMonth();
	b.cardExpYear();
	b.securityCodeField();
	b.completeBookingButton();
	  
  }
}
