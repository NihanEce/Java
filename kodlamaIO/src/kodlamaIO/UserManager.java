package kodlamaIO;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName()+ " " +  "ba�ar�yla kaydedildi");
		
	}
	
	public void remove(User user) {
		System.out.println(user.getFirstName()+ " " + user.getLastName()+ " " + "ba�ar�yla silindi");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "ba�ar�yla g�ncellendi");
	}
	
	public void addMultiple(User[] users) {
		for(User user:users) {
			add(user);
		}
	}
	

}
