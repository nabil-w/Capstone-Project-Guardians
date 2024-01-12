@smoke
Feature: Retail Account Page

  Background: 
    Given User is on the retail website homepage
    When User click on the login link
    And User enter email 'guardiantekstudent2@gmail.com' and password 'Tekschool123@'
    And User click on login button
    And Verify user is logged in
    When User click on Account option

  @UpdatingInfo
  Scenario: User is able to update profile information
    When User click on Account option
    When User update Name 'Simonn' and Phone '8889996617'
    And User click on update button
    Then User profile should be updated

  @Paymentmethod
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4444555566667780 | Allen       |              11 |           2026 |          211 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added sucessfully'

  @Editpayment
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on the Card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4444555566663001 | Reborts    |              12 |           2027 |          503 |
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  @RemovingCard
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  @AddressInfo
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country      | fullName      | phoneNumber | streetAddress | apt      | city      | state      | zipCode      |
      | countryValue | fullnameValue | PhoneValue  | stAddress     | aptValue | cityValue | stateValue | zipCodeValue |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  @UpdatAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill the new address form with below information
      | country      | fullName      | phoneNumber | streetAddress | apt      | city      | state      | zipCode      |
      | countryValue | fullnameValue | PhoneValue  | stAddress     | aptValue | cityValue | stateValue | zipCodeValue |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

  @RemovingAdd
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
