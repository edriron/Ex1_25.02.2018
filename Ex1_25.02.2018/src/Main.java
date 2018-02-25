public class Main {

	public static void main(String[] args) {
		Adress ad = new Adress(2, "Hadera", "Israel");
		Student a = new Student(100, "Amal", 21, "Ron", ad);
		Student b = new Student(95, "Ort", 23, "Alon", ad);
		
		System.out.println(a.toString() + "\n" + b.toString());
	}
}
