package in.co.rays.basics;

public class Pattern1010 {
	public static void main(String[] args) {
			for (int i = 1; i <=7; i++) {
				for (int j = 1; j <=8; j++) {
					if ((j%2!=0 && i%2!=0 || j%2==0 && i%2==0)) {
						System.out.print(1);
					}
					else {
						System.out.print(0);
						
					}
					
				}
				System.out.println();
				
			}
	}
}
