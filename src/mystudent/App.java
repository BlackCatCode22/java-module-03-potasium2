package mystudent;

public class App {
	public static void main(String[] args) {
		Student myStudent = new Student();
		myStudent.firstName = "Jack";
		myStudent.lastName = "Meyer";
		myStudent.major = "Computer Information Tech";
		myStudent.gpa = 3.6;
		myStudent.age = 20;
		myStudent.onProbation = false;
		
		Student myStudent2 = new Student();
		myStudent2.firstName = "Tim";
		myStudent2.lastName = "Raney";
		myStudent2.major = "Anthropology";
		myStudent2.gpa = 1.8;
		myStudent2.age = 21;
		myStudent2.onProbation = true;
		
		System.out.println(myStudent.firstName);
		System.out.println(myStudent2.firstName);
	}
}