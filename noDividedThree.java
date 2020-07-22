package assignment1;

public class noDividedThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Not divided by three");
		for(int i=1; i<=100; i++) {
			if(i%3 != 0) {
				System.out.print(i+"\t");
			}
			else {
				continue;
			}
		}
	}

}
