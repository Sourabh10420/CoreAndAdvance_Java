package in.co.rays.basics;

public class Pattern12 {
 public static void main(String[] args) {
	for (int i = 1; i <=9; i++) {
			for (int j = 1; j <=10; j++) {
				if(i<=5) {
					if((j<=6-i||j>=5+i)) {
					System.out.print("*");
					}
					else {
					if(j<i-4||j>=15-i) {
					System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					}
	
				}
				
			}
			System.out.println();
	}
	}
 }
 
