
abstract class Computer {
	void f1 () {
		System.out.println("f1 from class Computer");
	}
	abstract void f2 ();
	
}

class Desktop extends Computer {
	void f1 () {
		System.out.println("f1 from class Desktop");
	}
	void f2 () {
		System.out.println("f2 from class Desktop");
	}
}

class Notebook extends Computer {
	void f1 () {
		System.out.println("f1 from class Notebook");
	}
	void f2 () {
		System.out.println("f2 from class Notebook");
	}
}

public class Zuoye2 {
	public static void main(String[] argv) {
		Computer c1 = new Desktop();
		c1.f1();
		c1.f2();
		Computer c2 = new Notebook();
		c2.f1();
		c2.f2();
	}
}
