package homeWorks;

public class User {
	public User() {
		
	}
	
	public User(int id,String userName,String firstName,String lastName) {
		this();
		this.id=id;
		this.userName=userName;
		this.firstName=firstName;
		this.lastName=lastName;
	}


	int id;
	String userName;
	String firstName;
	String lastName;
}
