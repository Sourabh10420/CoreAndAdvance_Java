package co.in.rays.ArrayBasic;

public class JaggedArray {
	public static void main(String[] args) {
		int [][] a = new int [4][];
		a[0]=new int[4];
		a[1]=new int[5];
		a[2]=new int[7];
		a[3]=new int[5];
			int m = 0;
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a[i].length; j++) {
						a[i][j]= ++m;
						
					}
					
				}
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j]+"\t");
					
				}
				System.out.println();
				
			}
	}
	
}
