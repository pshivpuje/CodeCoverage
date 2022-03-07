package SonarAndJacoco.SonarAndJacoco;

public class Two {
public int divide (int numerator) {
	return numerator/0;
}
	public int addone (int number) {
		return dosomethingprivate(number);
	}
	private int dosomethingprivate(int number) {
	
		return number++;
	}
	public void dosomething() {
	Integer number = null;
	
	if(number > 0)
	{
		System.out.println("positive number");
	}
	
	}
}
