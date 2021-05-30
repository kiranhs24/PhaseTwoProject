Feature: Recipes for particular location
	
	  Scenario: Check Location set as Bangalore
	  	Given The user opens swiggy
	  	When User clicks on Bangalore
	  	Then Bangalore Location should be set 
	  	
	  Scenario: Check top rated recipes
	  	Given The user opens swiggy
	  	When User clicks on Bangalore
	  	And Selects top rated section
	  	Then Display recipes related to selection
	  	 