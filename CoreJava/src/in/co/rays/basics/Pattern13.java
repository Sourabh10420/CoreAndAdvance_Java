package in.co.rays.basics;

public class Pattern13 {
	public static void main(String[] args) {
		
		for (int i = 1; i <=7; i++) {
				for (int j = 1; j<=7; j++) {
					if (j>=4+i) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
		}
	}
}