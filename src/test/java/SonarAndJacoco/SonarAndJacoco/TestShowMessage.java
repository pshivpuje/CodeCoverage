package SonarAndJacoco.SonarAndJacoco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


	public class TestShowMessage {  
	    
	    String message = "Emma Watson";   
	      
	     
	    ShowMessage obj = new ShowMessage(message);  
	     
	     
	    @Test(expected = ArithmeticException.class)  
	    public void testshow() {      
	        System.out.println("We are inside of the show() method");       
	        obj.show();       
	    }  
	      
	    @Test  
	    public void testfinalMessage() {  
	        System.out.println("We are inside of the finalMessage() method");  
	        String msg = "Hello!" + "Emma Watson";  
	        assertEquals(msg,obj.finalMessage());  
	    }  
	}  

