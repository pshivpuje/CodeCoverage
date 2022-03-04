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
		 
	
	}
    

