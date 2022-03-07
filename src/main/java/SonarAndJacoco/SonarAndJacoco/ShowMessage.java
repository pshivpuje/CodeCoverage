package SonarAndJacoco.SonarAndJacoco;

import java.io.IOException;
import java.awt.Graphics;
import java.awt.Color;

public class ShowMessage {  
		
		   private static final String LOGGER = null;
		private static final String MRJobConfig = null;
		private String message;  
		   private String message1;
		   
		  
		   public ShowMessage(String message,String message1){  
		      this.message = message;
		      this.message1= message1;
		   }  
		   static void myMethod() {
			    System.out.println("I just got executed!");
			  }
		   public void show(){  
		     
		      System.out.println(message);  
		      
		      int a = 0;  
		      int b = 1/a;  
		   }     
		     
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
		 public void divide() {
			 int a=0;
			 int b=12;
			 int c=a%b;
				System.out.println("The mul is "+c);
		 }
		 static void myMethod1(String fname) {
			    System.out.println(fname + " Refsnes");
			  }
		 public void substraction1() {
			 int a=10;
			 int b=20;
			 int c=a-b;
			 System.out.println("The substraction is "+c);
			 
			 
		 }
		 static void checkAge(int age) { 
			    if (age < 18) {
			      throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
			    } else {
			      System.out.println("Access granted - You are old enough!"); 
			    }
			 } 
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
if (wordShifts == 0 && bitShiftsInWord == 0) {
return;
}

assert (wordShifts >= 0);
assert (bitShiftsInWord >= 0);
assert (bitShiftsInWord < 32);
if (wordShifts >= 4) {
zeroClear();
return;
}

final int shiftRestore = 32 - bitShiftsInWord;

final boolean noRestore = bitShiftsInWord == 0;
final int roundCarryNoRestoreMask = 1 << 31;
final int roundCarryMask = (1 << (bitShiftsInWord - 1)); 
}
		 private void zeroClear() {
			// TODO Auto-generated method stub
			
		}
		 
		 public void logSargResult(int stripeIx, boolean[] rgsToRead)
		 {
		  
		   int elements = 0;
		for (int i = 0, valOffset = 0; i < elements; ++i, valOffset += 64) {
		     long val = 0;
		     for (int j = 0; j < 64; ++j) {
		       int ix = valOffset + j;
		       if (rgsToRead.length == ix) break;
		       if (!rgsToRead[ix]) continue;
		       val = val | (1 << j);                
		     }
		    		   }
		 }
		 public void paint(Graphics g)
		    {
		        g.setColor(Color.red);
		        g.fillRect(0, 0, 200, 200);
		        g.setColor(Color.black);
		        g.drawLine(0, 0, 200, 200);
		        g.drawLine(200, 0, 0, 200);
		    }
		 int minval(int *A, int n) {
			  int currmin;

			  for (int i=0; i<n; i++)
			    if (A[i] < currmin)
			      currmin = A[i];
			  return currmin;
			}

		public static void main(String args[]) {
			 myMethod();
			    myMethod();
			    myMethod();
			    myMethod1("Liam");
			    myMethod1("Jenny");
			    myMethod1("Anja");
			    checkAge(15);
			
		 }
	}
    

