package kodlamaIO;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName()+ " " +  "baþarýyla kaydedildi");
		
	}
	
	public void remove(User user) {
		System.out.println(user.getFirstName()+ " " + user.getLastName()+ " " + "baþarýyla silindi");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "baþarýyla güncellendi");
	}
	
	public void addMultiple(User[] users) {
		for(User user:users) {
			add(user);
		}
	}
	

}
