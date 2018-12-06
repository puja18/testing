package HotelBookingPage;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefBookingPage {
	@Given("^User is on login page$")
	public void user_is_on_login_page()  {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	/*@Given("^user is on hotel booking page$")
	public void user_is_on_hotel_booking_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^User is on hotel booking page$")
	public void user_is_on_hotel_booking_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/

	@When("^User enter all the mandatory details$")
	public void user_enter_all_the_mandatory_details()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^navigate to confirmation page$")
	public void navigate_to_confirmation_page()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user does not enter all the madatory fields$")
	public void user_does_not_enter_all_the_madatory_fields()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^clicks the confirm booking button$")
	public void clicks_the_confirm_booking_button()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user enters all the mandatory fields$")
	public void user_enters_all_the_mandatory_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^does not enter first name$")
	public void does_not_enter_first_name() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user does not enter last name$")
	public void user_does_not_enter_last_name()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user does not enter email$")
	public void user_does_not_enter_email()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user does not enter mobile no$")
	public void user_does_not_enter_mobile_no() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^when user is on hotel booking page$")
	public void when_user_is_on_hotel_booking_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user enters the invalid valid mobile no$")
	public void user_enters_the_invalid_valid_mobile_no(DataTable arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	@Then("^display the appropriate error message$")
	public void display_the_appropriate_error_message()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user does not enter city$")
	public void user_does_not_enter_city()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user does not enter state$")
	public void user_does_not_enter_state() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user does not enter number of guests staying$")
	public void user_does_not_enter_number_of_guests_staying()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user enters <numberofGuests>$")
	public void user_enters_numberofGuests() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^allocate rooms such that (\\d+) room for minimum (\\d+) guests$")
	public void allocate_rooms_such_that_room_for_minimum_guests(int arg1, int arg2)  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user does not enter card holder name$")
	public void user_does_not_enter_card_holder_name(){
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user does not enter debit card number$")
	public void user_does_not_enter_debit_card_number()  {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("^user does not enter cvv$")
	public void user_does_not_enter_cvv() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("^user does not enter expiration month$")
	public void user_does_not_enter_expiration_month() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("^user does not enter expiration year$")
	public void user_does_not_enter_expiration_year() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("^user does not enter first name and last name$")
	public void user_does_not_enter_first_name_and_last_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter first name and email$")
	public void user_does_not_enter_first_name_and_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter first name and mobile no$")
	public void user_does_not_enter_first_name_and_mobile_no() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter first name and city$")
	public void user_does_not_enter_first_name_and_city() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter first name and state$")
	public void user_does_not_enter_first_name_and_state() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter first name and number of guests staying$")
	public void user_does_not_enter_first_name_and_number_of_guests_staying() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter first name and card holder name$")
	public void user_does_not_enter_first_name_and_card_holder_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter first name and debit card number$")
	public void user_does_not_enter_first_name_and_debit_card_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter first name and cvv$")
	public void user_does_not_enter_first_name_and_cvv() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter first name and expiration month$")
	public void user_does_not_enter_first_name_and_expiration_month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter first name and expiration year$")
	public void user_does_not_enter_first_name_and_expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter last name and email$")
	public void user_does_not_enter_last_name_and_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter last name and mobile no$")
	public void user_does_not_enter_last_name_and_mobile_no() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter last name and city$")
	public void user_does_not_enter_last_name_and_city() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter last name and state$")
	public void user_does_not_enter_last_name_and_state() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter last name and number of guests staying$")
	public void user_does_not_enter_last_name_and_number_of_guests_staying() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter last name and card holder name$")
	public void user_does_not_enter_last_name_and_card_holder_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter last name and debit card number$")
	public void user_does_not_enter_last_name_and_debit_card_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter email and mobile no$")
	public void user_does_not_enter_email_and_mobile_no() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter email and city$")
	public void user_does_not_enter_email_and_city() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter email and state$")
	public void user_does_not_enter_email_and_state() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter email and number of guests staying$")
	public void user_does_not_enter_email_and_number_of_guests_staying() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter email and card holder name$")
	public void user_does_not_enter_email_and_card_holder_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter email and debit card number$")
	public void user_does_not_enter_email_and_debit_card_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter email and cvv$")
	public void user_does_not_enter_email_and_cvv() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter email and expiration month$")
	public void user_does_not_enter_email_and_expiration_month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter email and expiration year$")
	public void user_does_not_enter_email_and_expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter mobile no and city$")
	public void user_does_not_enter_mobile_no_and_city() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter mobile no and state$")
	public void user_does_not_enter_mobile_no_and_state() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter mobile no and number of guests staying$")
	public void user_does_not_enter_mobile_no_and_number_of_guests_staying() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter mobile no and card holder name$")
	public void user_does_not_enter_mobile_no_and_card_holder_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter mobile no and debit card number$")
	public void user_does_not_enter_mobile_no_and_debit_card_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter mobile no and cvv$")
	public void user_does_not_enter_mobile_no_and_cvv() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter mobile no and expiration month$")
	public void user_does_not_enter_mobile_no_and_expiration_month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter mobile no and expiration year$")
	public void user_does_not_enter_mobile_no_and_expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter city and state$")
	public void user_does_not_enter_city_and_state() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter city and number of guests staying$")
	public void user_does_not_enter_city_and_number_of_guests_staying() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter city  and card holder name$")
	public void user_does_not_enter_city_and_card_holder_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter city  and debit card number$")
	public void user_does_not_enter_city_and_debit_card_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter city  and cvv$")
	public void user_does_not_enter_city_and_cvv() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter city  and expiration month$")
	public void user_does_not_enter_city_and_expiration_month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter city and expiration year$")
	public void user_does_not_enter_city_and_expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter state and number of guests staying$")
	public void user_does_not_enter_state_and_number_of_guests_staying() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter state  and card holder name$")
	public void user_does_not_enter_state_and_card_holder_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter state  and debit card number$")
	public void user_does_not_enter_state_and_debit_card_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter state  and cvv$")
	public void user_does_not_enter_state_and_cvv() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter state  and expiration month$")
	public void user_does_not_enter_state_and_expiration_month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter state and expiration year$")
	public void user_does_not_enter_state_and_expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter number of guests staying and card holder name$")
	public void user_does_not_enter_number_of_guests_staying_and_card_holder_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter number of guests staying  and debit card number$")
	public void user_does_not_enter_number_of_guests_staying_and_debit_card_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter number of guests staying  and cvv$")
	public void user_does_not_enter_number_of_guests_staying_and_cvv() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter number of guests staying  and expiration month$")
	public void user_does_not_enter_number_of_guests_staying_and_expiration_month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter number of guests staying and expiration year$")
	public void user_does_not_enter_number_of_guests_staying_and_expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter card holder name  and debit card number$")
	public void user_does_not_enter_card_holder_name_and_debit_card_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter card holder name and cvv$")
	public void user_does_not_enter_card_holder_name_and_cvv() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter card holder name  and expiration month$")
	public void user_does_not_enter_card_holder_name_and_expiration_month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter card holder name and expiration year$")
	public void user_does_not_enter_card_holder_name_and_expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter debit card number and cvv$")
	public void user_does_not_enter_debit_card_number_and_cvv() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter debit card number  and expiration month$")
	public void user_does_not_enter_debit_card_number_and_expiration_month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter debit card number and expiration year$")
	public void user_does_not_enter_debit_card_number_and_expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter cvv  and expiration month$")
	public void user_does_not_enter_cvv_and_expiration_month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter cvv and expiration year$")
	public void user_does_not_enter_cvv_and_expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user does not enter expiration month and expiration year$")
	public void user_does_not_enter_expiration_month_and_expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
