public class PatternAB{
	public static void main(String[] args){
		char ch ='A';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j<=i){
				System.out.print(ch);
				ch++;
				}
				else{
				System.out.print(" ");
				}
			}	
		ch--;
		System.out.println();		
		}
	}
}