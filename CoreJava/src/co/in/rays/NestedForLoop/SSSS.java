package co.in.rays.NestedForLoop;
public class SSSS{

public static void main(String[] args){

for(int i=1; i<=5; i++){
		
	for(int j=1; j<=10; j++){
		if(j==5-i && j==5+i)
		System.out.print("*");
		else
		System.out.print(" ");
	}

System.out.println();
}

}

}