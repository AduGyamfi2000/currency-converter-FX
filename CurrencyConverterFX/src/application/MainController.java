package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class MainController implements Initializable {
	
	Float amountToBeConverted;
    
	ObservableList<String> CurrencyList = FXCollections
			.observableArrayList("Cedi", "US Dollar", "Euro");


	
	@FXML
	private ChoiceBox<String> currencyFrom;
	
	@FXML
	private ChoiceBox<String> currencyTo;
	
	@FXML
    private TextField displayFrom;
	
	@FXML
    private TextField displayTo;
	
	@FXML
    private Button clear;
	
	@FXML
    private Button convert;

    @FXML
    private void Conversion() {
    	if (currencyFrom.getValue().equals("Cedi") && currencyTo.getValue().equals("US Dollar")) {
    		amountToBeConverted = Float.parseFloat(displayFrom.getText());
    		float convertedAmount = amountToBeConverted/10;
    		//displayTo.setText(String.valueOf(convertedAmount));
    		displayTo.setText(String.format("$%,.2f", convertedAmount));

             
    	} else if (currencyFrom.getValue().equals("US Dollar") && currencyTo.getValue().equals("Cedi")){
    		amountToBeConverted = Float.parseFloat(displayFrom.getText());
    		float convertedAmount = amountToBeConverted * 10;
    		//displayTo.setText(String.valueOf(convertedAmount));
    		displayTo.setText(String.format("$%,.2f", convertedAmount));
    	}  else if (currencyFrom.getValue().equals("US Dollar") && currencyTo.getValue().equals("Euro")){
    		amountToBeConverted = Float.parseFloat(displayFrom.getText());
    		float convertedAmount = amountToBeConverted * 5;
    		//displayTo.setText(String.valueOf(convertedAmount));
    		displayTo.setText(String.format("$%,.2f", convertedAmount));
    	}  else if (currencyFrom.getValue().equals("Euro") && currencyTo.getValue().equals("US Dollar")){
    		amountToBeConverted = Float.parseFloat(displayFrom.getText());
    		float convertedAmount = amountToBeConverted / 5;
    		//displayTo.setText(String.valueOf(convertedAmount));
    		displayTo.setText(String.format("$%,.2f", convertedAmount));
    	}  else if (currencyFrom.getValue().equals("Euro") && currencyTo.getValue().equals("Cedi")){
    		amountToBeConverted = Float.parseFloat(displayFrom.getText());
    		float convertedAmount = amountToBeConverted * 12;
    		//displayTo.setText(String.valueOf(convertedAmount));
    		displayTo.setText(String.format("$%,.2f", convertedAmount));
    	}  else if (currencyFrom.getValue().equals("Cedi") && currencyTo.getValue().equals("Euro")){
    		amountToBeConverted = Float.parseFloat(displayFrom.getText());
    		float convertedAmount = amountToBeConverted / 12;
    		//displayTo.setText(String.valueOf(convertedAmount));
    		displayTo.setText(String.format("$%,.2f", convertedAmount));
    	} 
            
    	}
     
    
    	
 
    @FXML
    private void clearForm() {
    	displayFrom.setText("");
        displayTo.setText("");
    }
	 @Override
	    public void initialize(URL url, ResourceBundle rb) {
	    	currencyFrom.getItems().addAll(CurrencyList);
	    	currencyFrom.setValue("Cedi");
	    	currencyTo.getItems().addAll(CurrencyList);
	    	currencyTo.setValue("US Dollar");
	
}
}
