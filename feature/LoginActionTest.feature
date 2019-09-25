Feature: Login Action Test
Scenario: Successful login with valid Credentialsd
  Given the login page is opened
	When user enters "lalitha" as a username and "password123" as a password
	When user click on login Button
	Then user will Finds a testmeapp homepage
	
	