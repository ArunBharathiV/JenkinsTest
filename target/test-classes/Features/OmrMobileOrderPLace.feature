Feature: Jenkins Test

  Scenario Outline: Testing an Url for Jenkins
  
  	Given User is on the form fill page
  	When User enters all the valid informations to register "<username>","<email>" and "<password>"
  	And User clicks Login button
  	Then User should see the "Registration Successful" message
  
  Examples:
  |username|email|password|
  |ArunBara|arunskumar98@gmail.com|Ab@r15rx100|