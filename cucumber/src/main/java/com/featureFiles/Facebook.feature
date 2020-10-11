Feature: Login into facebook application

Background:
And Open chrome browser
@Enbd2End
Scenario Outline: scenario description
    Given Launch url "Testurl2" in browser
    When enter valid "<username>" and "<password>"
    Then close all instances
    
    Examples:
    | username | password |
    | laxman2.kumar@gmail.com | cancel |
#    | maltrading@gmail.com | logout |
 
@RegressionTest
Scenario: scenario description
    Given Launch url "URL" in browser
    Then close all instances
    
@SmokeTest
Scenario: To check the list of string values
	Given the following animals:
  | cow   | cow1   |
  | horse | horse1 |
  | sheep | sheep1 |
	