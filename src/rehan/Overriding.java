package rehan;

public class Overriding {
public static void main(String[]args) {
	E p = new E();
	p.m1();
	F c = new F();
	c.m1();
	F e = new E();
	e.m1();
	
	}
}
class F {
	public  void m1() {
		System.out.println("cash land ");
		
	}
}
class E extends F{
	public  void m1() {
		System.out.println("cash propetr");
}
}