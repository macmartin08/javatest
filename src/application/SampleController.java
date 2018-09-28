package application;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {

    @FXML
    private TextField height;

    @FXML
    private TextField width;
    
    @FXML
    private TextField message;

    @FXML
    private Button create;
    
    @FXML
    private Label successmessage;
    
    @FXML
    private Label message1;
    
    
    
    
    
    public void getData() {
    	
    	//System.out.println(Double.parseDouble(height.getText()));
    
    	//Sign sign =new Sign(height.getText(),width.getText(),message.getText());
    	Sign sign =new Sign();
    	sign.setHeightSize(height.getText());
    	sign.setWidthsize(width.getText());
    	sign.setMessage(message.getText());
    	
    	
    	
    	if(sign.getSuccessmessage() == null) {
    		System.out.println("1");
    		
    		successmessage.setText(height.getText()+"wide * "+ width.getText()+ " high " +"\n message: "+ message.getText() );
    		
    		
    	}else {
    		System.out.println("2");
    		
    	
    	successmessage.setText(sign.getSuccessmessage());
    	}
  
    }


    
    
    
    
    
    
    

}
