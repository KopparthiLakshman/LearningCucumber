Feature: Login into facebook application

Background:
And Open chrome browser
@SmokeTest
Scenario Outline: scenario description
    Given Launch url "Testurl2" in browser
    When enter valid "<username>" and "<password>"
    Then close all instances
    
    Examples:
    | username | password |
    | laxman2.kumar@gmail.com | cancel |
#    | maltrading@gmail.com | logout |
 
@SmokeTest
Scenario: scenario description
    Given Launch url "URL" in browser
    Then close all instances

	
	