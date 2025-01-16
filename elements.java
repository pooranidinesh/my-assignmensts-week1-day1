package main.java.week3.day2;


	public class elements extends Button {
	    // Execution class also inherits Button
	    
	    public static void main(String[] args) {
	        // Creating objects of each class and calling respective methods
	        WebElement webElement = new WebElement();
	        webElement.click(); // Using WebElement method
	        
	        Button button = new Button();
	        button.click(); // Using Button method
	        button.submit(); // Using Button-specific method
	        
	        TextField textField = new TextField();
	        textField.setText("Hello, World!"); // Using WebElement method
	        System.out.println("Text in TextField: " + textField.getText()); // Using TextField-specific method
	        
	        checkbox checkBoxButton = new checkbox();
	        checkBoxButton.click(); // Using Button's inherited method
	        checkBoxButton.clickCheckButton(); // Using CheckBoxButton's method
	        
	        radiobutton radioButton = new radiobutton();
	        radioButton.click(); // Using Button's inherited method
	        radioButton.selectRadioButton(); // Using RadioButton's method
	    }
	}


