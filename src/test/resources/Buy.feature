@buy_allScenarios_MB
Feature: Buy Functionality of Magicbricks
	I want to test the Buy Functionality of Magicbricks
	@readyToMove
	Scenario: Search for Popular Choices in Buy
		Given User is on the Home Page
		When User selects Buy
		And User selects required option from Popular Choices
		Then User should navigate to ready to move page
		
	@PropertyTypes
	Scenario: Search for Property Types in Buy
		Given User is on the Home Page
		When User selects Buy						
		And User selects required option from Property Types
		Then User should navigate to Property Types page
			
	@Explore
	Scenario: Search for Explore in Buy
		Given User is on the Home Page
		When User selects Buy
		And User selects required option from Explore
		Then User should navigate to Explore page
		
	@BuyingTools	
	Scenario: Search for Buying Tools in Buy	
		Given User is on the Home Page
		When User selects Buy	
		And User selects required option from Buying Tools
		Then User should navigate to the Tools page
		
		
		