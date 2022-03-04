package SonarAndJacoco.SonarAndJacoco;


	public class ShowMessage {  
		   private String message;  
		  
		   public ShowMessage(String message){  
		      this.message = message;   
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
		   public void newmessage() {
			   String msg = "How is " + message;
			   System.out.println(msg);
			   
		   }
		 public void addition() {
			 int a=10;
			 int b=20;
			 int c=a+b;
			 System.out.println("The addition is "+c);
		 } 
		 public void substraction() {
			 int a=10;
			 int b=20;
			 int c=a-b;
			 System.out.println("The substraction is "+c);
		 }
		 public void substraction1() {
			 int a=10;
			 int b=20;
			 int c=a-b;
			 System.out.println("The substraction is "+c);
		 }
	}
    

