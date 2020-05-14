Feature: E2E flow of Test2

#Background:
#Given browser launched successfully in chrome

@SmokeTest
Scenario: Validate the parameterization using Data tables in Gherkin
Given user login to home page of "chrome"
When user clicks on button "submit" and "confirm"
And user enters details on table 
|Name  | Surname| Mail       | Ph Number|
|Anjali| Nayak | abc@gmail.com| 68798090|

@RegressionTest
Scenario Outline: Validate the parameterization using scenario definition in Gherkin
Given user login to home page of "mozilla"
When user clicks on button "submit1" and "confirm1"
And user clicks on buttons "<buttonName1>" and "<buttonName2>"

Examples: 
|buttonName1    |	 buttonName2|
|button1        |    button2    |
|button3        |    button4    |
