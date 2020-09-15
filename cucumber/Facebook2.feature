Feature: Facebook scenario2 features file


Scenario Outline: scenario description
	Given Open chrome browser
    Given Launch url "Testurl2" in browser
    When enter valid "<username>" and "<password>"
    Then close all instances
    
       Examples:
    | username | password |
    | laxman3.kumar@gmail.com | cancel |
    | maltrading@gmail.com | logout |
   
