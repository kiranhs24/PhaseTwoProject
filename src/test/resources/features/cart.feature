Feature: Check for cart
	
	  Scenario: Check for empty cart when no items are added
	  	Given The user opens swiggy
	  	When User clicks on Bangalore
	  	And Clicks on Cart without adding any items
	  	Then A message should be displayed saying your cart is empty 
	  	
	  Scenario: Check if Delivery Address and Payment are enabled for empty cart
	  	Given The user opens swiggy
	  	When User clicks on Bangalore
	  	And Clicks on Cart without adding any items
	  	Then Delivery and Payment should not be enabled
