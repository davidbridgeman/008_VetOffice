package arrayClassesPackage;

public class StudentArray {
	
	Student[] myStudents = new Student[3];
	
	public void buildArray() {
		
		myStudents[0] = new Student();
		myStudents[0].setFname("Tyler");
		myStudents[0].setLname("Smith");
		myStudents[0].setYearInSchool(11);
		
		myStudents[1] = new Student();
		
		myStudents[2] = new Student();
		
	}
	
	public void showArray() {
		
		for (int s = 0; s < myStudents.length; s++) {
			
			System.out.println("First name: " + myStudents[0].getFname());
			System.out.println("Last name: " + myStudents[0].getLname());
			System.out.println("Year in school: " + myStudents[0].getYearInSchool());
			System.out.println("");
			
		}
		
	}

}
