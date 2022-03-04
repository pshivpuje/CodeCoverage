package SonarAndJacoco.SonarAndJacoco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


	public class TestShowMessage {  
	    
	    String message = "Emma Watson";
	    String message1= "Prathamesh";
	      
	     
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
	    public void testnewmessage() {  
	        System.out.println("We are inside of the NewMessage() method");  
	        String msg1 = "who is " + "prathamesh";  
	        assertEquals(msg1,obj.newmessage()); 
	        }

		@Test(expected = ArithmeticException.class)
	    public void testdivide() {  
	        System.out.println("We are inside of the testdivide() method");    
			obj.divide();
	    } 
	    
	}  

