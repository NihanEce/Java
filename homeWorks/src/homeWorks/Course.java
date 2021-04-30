package homeWorks;

public class Course {
	public Course() {
		System.out.println("Dersler listelendi");
}

	public Course(int id, int teacherId, String name, double price) {
		this();
		this.id = id;
		this.teacherId = teacherId;
		this.name = name;
		this.price = price;
		
	}

	int id;
	int teacherId;
	String name;
	double price;
}
	
	
