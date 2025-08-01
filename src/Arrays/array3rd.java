package Arrays;

public class array3rd {
public static void main(String [] args) {
	int [][][] x = {{{10,100,1000},{20,200,200},{30,600,900}}};
	for(int i = 0; i < x.length;i++) {
		for(int j = 0; j < x[i].length; j++) {
			
			for(int k = 0; k < x[i][j].length;k++) {
				System.out.println(x[i][j][k] + " ");
				
			}
			System.out.println();
		}
		System.out.println("---");
	}
	
	
	
}
}
