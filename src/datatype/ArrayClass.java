package datatype;

public class ArrayClass {
	public static void main(String[]args) {
		String [] student = new String [4];
		int [] marks = new int [4];
		
		student[0] = "Mohd rehan ansari ";
		student [1] = "The little flower college";
		student [2] = "A first division";
		student [3] = "Tanda Ambedkar nagar ";
          marks[1] = 45;
          marks[2] = 52;
          marks[3] = 78;
          marks[0] = 68;
          
		
		System.out.println("Name of the student   "+student[0]);
		System.out.println("Name of the college   "+student[1]);
		System.out.println("Student Grade         "+student[2]);
		System.out.println("Address               "+student[3]);
		System.out.println("English               "+marks[0]);
		System.out.println("Hindi                 "+marks[1]);
		System.out.println("computer              "+marks[2]);
		System.out.println("java                  "+marks[3]);
		
		
		
		
	}

}
