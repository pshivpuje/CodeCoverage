package SonarAndJacoco.SonarAndJacoco;

public class Duplications {
	
	    void show()
	    {
	        System.out.println("Parent's show()");
	    }
	}
	  
	// Inherited class
	class Child extends Duplications {
	    // This method overrides show() of Parent
	    @Override
	    void show()
	    {
	        System.out.println("Child's show()");
	    }
	}
	class Child1 extends Duplications {
	    // This method overrides show() of Parent
	    @Override
	    void show()
	    {
	        System.out.println("Child's show1()");
	    }
	}
	class Child2 extends Duplications {
	    // This method overrides show() of Parent
	    @Override
	    void show()
	    {
	        System.out.println("Child's show2()");
	    }
	}
	class Child3 extends Duplications {
	    // This method overrides show() of Parent
	    @Override
	    void show()
	    {
	        System.out.println("Child's show3()");
	    }
	}
	// Driver class
	class Main {
	    public static void main(String[] args)
	    {
	        // If a Parent type reference refers
	        // to a Parent object, then Parent's
	        // show is called
	       Duplications obj1 = new Duplications();
	        obj1.show();
	  
	        // If a Parent type reference refers
	        // to a Child object Child's show()
	        // is called. This is called RUN TIME
	        // POLYMORPHISM.
	        Duplications obj2 = new Child();
	        obj2.show();
	    }
	
}
