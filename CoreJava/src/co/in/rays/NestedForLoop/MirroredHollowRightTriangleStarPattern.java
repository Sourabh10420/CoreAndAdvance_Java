package co.in.rays.NestedForLoop;
public class MirroredHollowRightTriangleStarPattern{

public static void main(String[] args){

for(int i=1; i<=5;i++){
	
	for(int j=5; j>=1; j--){
		if(j==5||i==5){
	
		System.out.print("* ");
		}
		else{
		System.out.print("  ");
		}
	
	}
System.out.println();
}
}

}