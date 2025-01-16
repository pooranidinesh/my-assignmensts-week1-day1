package main.java.week3.day2;

public class TestDataExample {
	
	    public static void main(String[] args) {
	        
	        // Create an object of LoginTestData (which inherits from TestData)
	        LoginTestData loginTestData = new LoginTestData();
	        
	        // Call methods from the subclass (LoginTestData)
	        loginTestData.enterUsername();  // Specific to LoginTestData
	        loginTestData.enterPassword();  // Specific to LoginTestData
	        
	        // Call methods inherited from TestData
	        loginTestData.enterCredentials();  // Inherited from TestData
	        loginTestData.navigateToHomePage();  // Inherited from TestData
	    }
	}


