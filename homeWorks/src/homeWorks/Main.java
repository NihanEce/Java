package homeWorks;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,1,"Yazılım Geliştirici Kampı(C# + Angular)",1500);
		Course course2 = new Course(2,2,"Yazılım Geliştirici Kampı(Java + React)",2500);
		Course course3 = new Course(3,3,"Yazılım Geliştirici Kampı(Python)",3000);

		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.addToCourse(course3);
		
		Course[] courses = new Course[] {course1,course2,course3};
		System.out.println("Sistemde kayıtlı" + courses.length + "kurs bulunmaktadır");
		for(Course course: courses) {
			System.out.println(course.id + "-" +course.name + "-" +course.price);
		}
		
		User user1 = new User(1,"Nihanece","Nihan Ece"," " + "Algül");
		User user2 = new User(2,"Ufyc","Ufuk"," " + "Algül");
		User user3 = new User(3,"Remisin", "Sinan"," " +"Keten");
		
		UserManager userManager = new UserManager();
		userManager.addToUser(user1);
		userManager.addToUser(user2);
		userManager.addToUser(user3);
		
		User[] users= new User[] {user1,user2,user3};
			System.out.println("Sistemde kayıtlı"+ " " + users.length + " " + "kullanıcı bulunmaktadır");
			for(User user: users) {
				System.out.println(user.id + "-" +user.firstName + "" + user.lastName);
			}
	}

}
