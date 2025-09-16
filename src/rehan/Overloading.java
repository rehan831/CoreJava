package rehan;

public class Overloading {
	public static void main(String[] args) {
		P p = new P();
		p.m(0);
		C c = new C();
		c.m(25.0);
	}

}
class P{
	public static void m(int x) {
		System.out.println("Rehan Ansari");
	}
}
class C extends P{
	public static void m(double d) {
		System.out.println("Ansari on;y");
	}
}
