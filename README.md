Test suite for running tests against banking applications

The suite contains the following 5 tests that cover the acceptance criteria.


Test 1 - Relevant validation rules fire for all mandatory fields on the Register a new user function.

Test 2 - User can successfully register a new savings account when valid data is entered.

Test 3 - User can log into their account open a new savings account and $100 is transferred from their main account.

Test 4 - User can transfer money between two of their accounts.

Test 5 - User can retrieve their login credentials by completing the Forgot login info? section.

Running the tests.

The tests have been alphabetically named so when running as a suite they will execute in the correct order. Logging the user out after each test ensures the tests do not fall over each other.

The tests can be run several ways and as a suite or individually.


1.-The command line – using the command mvn test will run the entire suite of 5 tests.
	
2.-In the IntelliJ console – using the green play arrow at the public class TestPlan level the entire suite of 5 tests will be run. If an individual test needs to be run the green play arrow against that test can be used for example public static void testBuserSignUp.

!!!!!! When running the tests to ensure the service is not picking up the same users it is advisable to update the FIRST_NAME and USERNAME in the WebPage.java file to a new user after each test run. This ensures the tests do not attempt to re-register a user and cause the suite to fail. !!!!!
