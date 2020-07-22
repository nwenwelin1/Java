package assignment1;

public class numberTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<11; i++) {
			for(int j=i; j<=(i*10); j+=i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}
