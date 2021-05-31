Feature: Check Login Page
	
	  Scenario: Check login page
	  	Given The user opens swiggy
	  	When Clicks on Login
	  	Then User should see login page and create account button 
	  	
	  Scenario: Check create account page
	  	Given The user opens swiggy
	  	When Clicks on create account 
	  	Then User should be able to see sign up page
