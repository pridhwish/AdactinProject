Feature: Login functionality of adactin application 


@smoketest
Scenario Outline: User enters valid username and password 
	Given User launches url of adactin application 
	When User enters "<Username>" as username 
	And User enters "<Password>" as password 
	And User click Login button 
	Then User validate login button 
	
	Examples:
	|Username|Password|
	|ramu|2324535|
	|kabcd|ggv44|
	|SowmiyaSri|Sowmiya05|
	
	
	@smoketest
Scenario: select the hotel and fill up the fields and search 
	When User select location 
	And User select hotel 
	And User select room type 
	And User select no of rooms 
	And User clears  check in date 
	And User enters check in date 
    And User clears  check out date 
	And User enters check out date 
	And User select adults per room 
	And User select children per room 
	Then User clicks search button 
	
Scenario: select hotel and continue  
	When select radio button
	Then click continue

Scenario: fill details and book hotel
    When User enters first name
    When User enters last name
    When User enters billig address
    When User enters credit card number
    When User select credit card type
    When User select cards expiry month
    When User select cards expiry year
    When User enters CVV number
    Then user validate book now  
    