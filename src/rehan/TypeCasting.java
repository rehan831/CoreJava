package rehan;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal  a = new Dog();
		Dog d = (Dog) a;
		d.sound();
		d.bark();

	}

}
class Animal{
	void sound() {
		System.out.println("Animal makes a sound");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("bhau bhau");
	}
	
	void bark() {
		System.out.println("dog barks");
	}
}
