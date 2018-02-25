public class Student extends Person {
	private int grade;
	private String schoolName;
	
	public Student(int grade, String schoolName, int age, String name, Adress address) {
		super(age, name, address);
		this.grade = grade;
		this.schoolName = schoolName;
	}
	
	@Override
	public String toString() {
		return "Name: " + super.fullName + " from " + address.toString() + " is " + age + " from " + schoolName
				+ " school got " + grade;
	}
}