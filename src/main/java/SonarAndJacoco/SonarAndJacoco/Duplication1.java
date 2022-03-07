package SonarAndJacoco.SonarAndJacoco;

public class Duplication1 extends Duplications {
	void shown() {
	System.out.println("This is second");
}
}

class Child4 extends Child1{
	void shown1() {
	System.out.println("This is third");
}
}
class Child5 extends Child1{
	void shown1() {
		System.out.println("This is Fourth");
	}
}
	
class Child6 extends Child1{
	void shown1() {
		System.out.println("This is Fifth");
	}
}
class Child7 extends Child2{
	void shown1() {
		System.out.println("This is Sixth");
	}
}
class Child8 extends Child2{
	void shown1() {
		System.out.println("This is Seventh");
	}
}
