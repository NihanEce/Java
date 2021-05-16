package kodlamaIO;

public class Main {

	public static void main(String[] args) {
		User user = new User(1,"Nihan","Algül","nihanecealgul@gmail.com","Nihanece","12345","Kavacık Mah. Göksu Otağtepe Cad. No:34");
		User user1 = new User();
		user1.setId(2);
		user1.setFirstName("Ufuk");
		user1.setLastName("Algül");
		user1.setEmail("ufyc@hotmail.com");
		user1.setUserName("Ufyc");
		user1.setPassword("34567");
		user1.setAddress("Kavacık Mah. Göksu Otağtepe Cad. No:34");
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Sinan");
		student.setLastName("Keten");
		student.setTakenCourse("Python");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Erol");
		student2.setLastName("Keten");
		student2.setTakenCourse("Java");
		
		Student student3 = new Student();
		student3.setId(2);
		student3.setFirstName("Nurhayat");
		student3.setLastName("Keten");
		student3.setTakenCourse("Java");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setPassword("35965");
		instructor.setgivenCourse("C#");
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		userManager.add(user1);
		
		System.out.println("------------------------------");
		
		User[] users = {user,user1,student,instructor};
		userManager.addMultiple(users);
		
		System.out.println("------------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.add(student2);
		studentManager.remove(student3);
	}

}
