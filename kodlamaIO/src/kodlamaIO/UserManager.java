package kodlamaIO;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName()+ " " +  "başarıyla kaydedildi");
		
	}
	
	public void remove(User user) {
		System.out.println(user.getFirstName()+ " " + user.getLastName()+ " " + "başarıyla silindi");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "başarıyla güncellendi");
	}
	
	public void addMultiple(User[] users) {
		for(User user:users) {
			add(user);
		}
	}
	

}
