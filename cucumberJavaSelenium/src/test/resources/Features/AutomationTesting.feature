Feature: feature to test to AutomationSearch fucntionality

@TestCase-1
Scenario:  Test Case 1 - validate Quantity of Sliders :
Given browser is open
And User is on Automation Seach Page 
When User able to click on Shop Menu 
And Now click on Home menu button  
Then Test whether the Home page has Three Sliders only
And The Home page must contains only three sliders


@TestCase-2
Scenario: Test Case 2 -  validate Quantity of Arrivals :
Given browser is open
And User is on Automation Seach Page 
When User able to click on Shop Menu 
And Now click on Home menu button  
Then Test whether the Home page has Three Arrivsals only
And The Home page must contains only three Arrivals

@TestCase-3
Scenario:  Test Case 3 - As an existing user can adding Book
Given browser is open
And User is on Automation Seach Page 
When User able to click on Shop Menu 
And Now click on Home menu button  
When user click the image in the Arrivals 
Then Test whether it is navigating to next page where the user can add that book into his basket
And Image should be clickable and shoul navigate to next page where user can add that book to his basket

@TestCase-4
Scenario:  Test Case 4 - As an existing user can See Description of Book:
Given browser is open
And User is on Automation Seach Page 
When User able to click on Shop Menu 
And Now click on Home menu button  
When user click the image in the Arrivals 
Then Test whether it is navigating to next page where the user can add that book into his basket
And Image should be clickable and shoul navigate to next page where user can add that book to his basket
Then user able to Click on Description tab for the Book
And There should be a description regarding that book the user clicked on

@TestCase-5
Scenario: Test Case 5 - As an existing User can Check the Discount :
Given browser is open
And User is on Automation Seach Page 
When User able to click on Shop Menu 
And Now click on Home menu button  
When user click the image in the Arrivals 
Then Test whether it is navigating to next page where the user can add that book into his basket
And Image should be clickable and shoul navigate to next page where user can add that book to his basket
Then Click on the Add To Basket button which adds that book to your basket
And User can view that Book in the Menu item with price
Then user click on Item link which navigates to proceed to check out page.
Then User leads to the check out page
When Enter the Coupon code as krishnasakinala to get 50rps off on the total.
But User can not able to apply coupon because the coupon is applicable for the book price > 450 rps

@TestCase-6
Scenario:  Test Case 6 - As an existing user can Remove the Product :
Given browser is open
And User is on Automation Seach Page 
When User able to click on Shop Menu 
And Now click on Home menu button  
Then Test whether the Home page has Three Arrivsals only
And The Home page must contains only three Arrivals
When user click the image in the Arrivals 
Then Test whether it is navigating to next page where the user can add that book into his basket
And Image should be clickable and shoul navigate to next page where user can add that book to his basket
Then Click on the Add To Basket button which adds that book to your basket
And User can view that Book in the Menu item with price
Then user click on Item link which navigates to proceed to check out page.
Then click on Remove this icon in Check out page 
And User has the feasibility to remove the book at the time of check out also

@TestCase-7
Scenario:  Test Case 7 - As an existing user Update the Items :
Given browser is open
And User is on Automation Seach Page 
When User able to click on Shop Menu 
And Now click on Home menu button  
Then Test whether the Home page has Three Arrivsals only
And The Home page must contains only three Arrivals
When user click the image in the Arrivals 
Then Test whether it is navigating to next page where the user can add that book into his basket
And Image should be clickable and shoul navigate to next page where user can add that book to his basket
Then Click on the Add To Basket button which adds that book to your basket
And User can view that Book in the Menu item with price
Then user click on Item link which navigates to proceed to check out page.
Then  Click on textbox value 
And Now after the above change Update Basket button will turn into Clickable mode.
Then click on Update Basket 
And User has the feasibility to Update Basket at the time of check out.

@TestCase-8
Scenario: Test Case 8 - As an existing user can fetch Final Billing:		
Given browser is open
And User is on Automation Seach Page 
When User able to click on Shop Menu 
And Now click on Home menu button  
Then Test whether the Home page has Three Arrivsals only
And The Home page must contains only three Arrivals
When user click the image in the Arrivals 
Then Test whether it is navigating to next page where the user can add that book into his basket
And Image should be clickable and shoul navigate to next page where user can add that book to his basket
Then Click on the Add To Basket button which adds that book to your basket
And User can view that Book in the Menu item with price
Then user click on Item link which navigates to proceed to check out page.
And  User can find the Total price of the book in the Check out grid.
Then User has the feasibility to find the total price of the books at the time of check out

@TestCase-9
Scenario: Test Cases 9 -As an existing user can Check Out Updated Basket
Given browser is open
And User is on Automation Seach Page 
When User able to click on Shop Menu 
And Now click on Home menu button  
Then Test whether the Home page has Three Arrivsals only
And The Home page must contains only three Arrivals
When user click the image in the Arrivals 
Then Test whether it is navigating to next page where the user can add that book into his basket
And Image should be clickable and shoul navigate to next page where user can add that book to his basket
Then Click on the Add To Basket button which adds that book to your basket
And User can view that Book in the Menu item with price
Then user click on Item link which navigates to proceed to check out page.
Then  Click on textbox value 
And Now after the above change Update Basket button will turn into Clickable mode.
Then click on Update Basket 
And User has the feasibility to Update Basket at the time of check out.
