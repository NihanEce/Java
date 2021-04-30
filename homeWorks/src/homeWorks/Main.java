package homeWorks;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,1,"Yaz�l�m Geli�tirici Kamp�(C# + Angular)",1500);
		Course course2 = new Course(2,2,"Yaz�l�m Geli�tirici Kamp�(Java + React)",2500);
		Course course3 = new Course(3,3,"Yaz�l�m Geli�tirici Kamp�(Python)",3000);

		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.addToCourse(course3);
		
		Course[] courses = new Course[] {course1,course2,course3};
		System.out.println("Sistemde kay�tl�" + courses.length + "kurs bulunmaktad�r");
		for(Course course: courses) {
			System.out.println(course.id + "-" +course.name + "-" +course.price);
		}
		
		User user1 = new User(1,"Nihanece","Nihan Ece"," " + "Alg�l");
		User user2 = new User(2,"Ufyc","Ufuk"," " + "Alg�l");
		User user3 = new User(3,"Remisin", "Sinan"," " +"Keten");
		
		UserManager userManager = new UserManager();
		userManager.addToUser(user1);
		userManager.addToUser(user2);
		userManager.addToUser(user3);
		
		User[] users= new User[] {user1,user2,user3};
			System.out.println("Sistemde kay�tl�"+ " " + users.length + " " + "kullan�c� bulunmaktad�r");
			for(User user: users) {
				System.out.println(user.id + "-" +user.firstName + "" + user.lastName);
			}
	}

}
