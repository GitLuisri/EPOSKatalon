@IDN-2313
@IDN-2307
Feature: Test Product Spec Creation from Confluence

	#Tests As a Product Team, Given i can access confluence, when i create product spec from confluence, then it can be linked to JIRA directly
	@IDN-2314 @IDN-2309
	Scenario Outline: Test Test 1
		
		
		Given i open browser
		When i input <username> and <password>
		And i click login
		Then i can login
		
		Examples:
		
		|username | password|
		|asd|asd|
		