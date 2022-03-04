package SonarAndJacoco.SonarAndJacoco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

	public class TestShowMessage {  
	    //Creating message property with the default string  
	    String message = "Emma Watson";   
	      
	    //Creating object of the ShowMessage class  
	    ShowMessage obj = new ShowMessage(message);  
	     
	    //testShow() method by adding the ArithmeticException  
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

