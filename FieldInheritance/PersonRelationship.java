package prj2;

public class PersonRelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p= new Person("nwe","Monywa");
		Students student= new Students(p.name,p.address,"program1",5,50000);
		Staff staff= new Staff(p.name,p.address,"CU(monywa)",52000);
		System.out.println("student information:");
		student.showStudentsInfo();
		System.out.println();
		System.out.println("staff information:");
		staff.showStaffInfo();
	}

}
