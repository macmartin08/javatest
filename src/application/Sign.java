package application;

public class Sign {
	
	private String message;
	private Double heightSize,widthsize;
	
	private String successmessage = null;
	
	String heightError,widthError;
	
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		if(message.equals(null))
			
		setSuccessmessage("Message cannot be empty");
		else {
			this.message = message;
		}
	}
	public Double getHeightSize() {
		return heightSize;
	}
	public void setHeightSize(String heightSize) {
		try {
		if(Double.parseDouble(heightSize) >=10 && Double.parseDouble(heightSize) <= 100)
			this.heightSize = Double.parseDouble(heightSize);
		else 
			throw new IllegalArgumentException("Height field must be in 10 - 100");
		}catch(IllegalArgumentException e) {
			
					
			setSuccessmessage( "Height field must contain a number"); 
		}
	}
	public Double getWidthsize() {
		return widthsize;
	}
	public void setWidthsize(String widthsize) {
		try {
		if(Double.parseDouble(widthsize) >=50 && Double.parseDouble(widthsize) <= 100)
			this.widthsize = Double.parseDouble(widthsize);
		else
			throw new IllegalArgumentException("Width field must be in 50 - 100");
		}catch(IllegalArgumentException e) {	
			setSuccessmessage( " \n Width field must contain a number"); 
		}
	}
	public String getSuccessmessage() {
		return successmessage;
	}
	public void setSuccessmessage(String successmessage) {
		this.successmessage += successmessage;
	}
	
	

	
	
}
