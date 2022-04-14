Feature: Login into facebook application

Background:
And Open chrome browser
@Enbd2End
Scenario Outline: scenario description
    When enter valid "<username>" and "<password>"
    Then close all instances

    Examples:
    | username | password |
		| username | password |
 
@RegressionTest
Scenario: scenario description for Regression Test
    Given Launch url "URL" in browser
    Then close all instances
    
@SmokeTest
Scenario: To check the list of string values
	Given the following animals:
  | cow   | cow1   |
  | horse | horse1 |
  | sheep | sheep1 |
	