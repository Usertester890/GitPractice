Feature: E2E flow of Test2

Background:
Given browser and link is launched successfully in chrome


Scenario: Validate the parameterization using Data tables in Gherkin
#Given user click on footer link
When user click on Travel option
And user click on Lifestyle drop down
And user select "weather" link
#And user capture todays weather for Bangalore
And user captures "todays" weather for "Bengaluru"
And user captures "todays" weather for "Delhi"
And user captures "tomorrows" weather for "Delhi"
And user closes the browser

