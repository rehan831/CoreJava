package Asighnmentoperator;
 class Test {
    public static void main(String[] args) {
        Text t = new Text();   // Object banaya
        t.dog();               // Dog method call
        t.cat();               // Cat method call
    }


}

interface serviceprovider {

	void dog();
	void cat();
}
 class Text implements serviceprovider {
    public void dog() {
        System.out.println("D07675 barking...");
    } 
    public void cat() {
        System.out.println("Cat is meowing...");
    }

   }