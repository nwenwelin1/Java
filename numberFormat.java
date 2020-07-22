package assignment1;

public class numberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=1000; i++) {
			System.out.print(i+"\t");
			if(i%10 ==0) {
				System.out.println();
			}
		}
	}

}
