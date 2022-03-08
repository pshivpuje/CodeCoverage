package SonarAndJacoco.SonarAndJacoco;

import java.io.IOException;
import java.awt.Graphics;
import java.awt.Color;


public class ShowMessage {  
		
		//   private static final String LOGGER = null;
	//	private static final String MRJobConfig = null;
		private String message;  
		   private String message1;
		   
		  
		   public ShowMessage(String message,String message1){  
		      this.message = message;
		      this.message1= message1;
		   }  
		   static void myMethod() {
			    System.out.println("I just got executed!");
			  }
		 /*  public void show(){  
		     
		      System.out.println(message);  
		      
		  //    int a = 0;  
		    //  int b = 1/a;  
		   }     */
		     
		   public String finalMessage(){  
		      String msg = "Hello!" + message;  
		      System.out.println(msg);  
		      return msg;  
		   }     
		   public String newmessage() {
			   System.out.println(message1);
			   String msg1 = "Who is " + message1;
			   System.out.println(msg1);
			return msg1;
			   
		   }
		 public void addition() {
			 int a=10;
			 int b=20;
			 int c=a+b;
			 System.out.println("The addition is "+c);
		 } 
		/* public void divide() {
			 int a=0;
			 int b=12;
			 int c=a%b;
				System.out.println("The mul is "+c);
		 }
		 */
		 
		 /*
		 static void myMethod1(String fname) {
			    System.out.println(fname + " Refsnes");
			  }
		 public void substraction1() {
			 int a=10;
			 int b=20;
			 int c=a-b;
			 System.out.println("The substraction is "+c);
			 
			 
		 }
		 */
		 static void checkAge(int age) { 
			    if (age < 18) {
			      throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
			    } else {
			      System.out.println("Access granted - You are old enough!"); 
			    }
			 } 
		 /*
		 public boolean satisfiedBy() {
			 
			  String text = null;
			  if (text == null || text.length() < 2) {
			    return false;
			  }
			  if ("0".equals(text) || "0L".equals(text) || "0l".equals(text)) {
			    return false;
			  }
			  return text.charAt(0) == '0';
			}
		 private void shiftRightDestructive(int wordShifts,
                 int bitShiftsInWord,
                 boolean roundUp) 
{

	
		 }
		 */

		
		public static void main(String args[]) {
			
		 }
	}
    

