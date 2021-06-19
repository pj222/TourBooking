# Part 1: Exploratory testing

Notes:
- Hotels seem to be not available,so I have booked a tour.


**Scenario: Book a tour**


- **Functionality: Select  tour,date and Adults**

    **Expected Behaviour** : The user is able to select tour with date and adults and are reflected same in the next page

    **Actual Behaviour**: Date selected from home page does not carry forward to the next page(Booking page),it's a current date,also user can not select child and infant values from home page.[***Bug***]


**Functionality: Tour type**

    **Expected Behaviour** : Prices should change based on the tour type.

    **Actual Behaviour**: Selecting different tour types for the same trip,does not make any change in the prices.Significance of tour type is not not achieved [***Bug***]
	
	
- **Functionality: Calculate total from Booking page**

    **Expected Behaviour** : Total includes all the values.

    **Actual Behaviour**: Total does not include Deposit value [***Bug***]


- **Functionality: Change the date from Booking page**

  **Expected Behaviour** : The user is able to change the date and is refleected same on the next page.

  **Actual Behaviour**: The user is able to change the date but is not refleected same on the next page for this.Significance of change date is not not achieved. [***Bug***]


- **Functionality: Calculate total from Personal Details page**

    **Expected Behaviour** : Total includes all the values.
  
    **Actual Behaviour**: Total does not include Deposit and Tax values [***Bug***]

   
- **Functionality: Confirm Booking**

    **Expected Behaviour** : User is able to select the checkbox for terms and conditions.
  
    **Actual Behaviour**: No checkboxc is avaialbe and user can still confirm the booking.This means user can confirm the booking without accepting thier terms and conditions.[***Bug***]

    **Functionality: Pay on arrival**

    **Expected Behaviour** : User is able to select the option PAY ON ARRIVAL,and reserve the tour.
  
    **Actual Behaviour**: User is able to select the option PAY ON ARRIVAL,and reserve the tour.


