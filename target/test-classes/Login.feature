
Feature: Validating search function of Adactin application

  Background:
  Given user is on Adactin page # browser, url-->Pre conditional
  When user need to enter username and password on Adactin page
  And user need to click login button
  
  Scenario: Filling search functionality of fields marked with red asterix (*) are mandatory
  When user should select the location,no of rooms,checkin date,checkout date,adults per room
  And user should click search button
  
  Scenario: Filling search functionality of fields which is not marked with red asterix (*) are mandatory
  When user need to select hotel,room type and child per room
  And user should click search button
  
  
 
  
  
  
