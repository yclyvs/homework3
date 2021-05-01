package homework3;

public class User {
	int id;
	private String userName;
	private String userPassword;
	private String email;
	private String firstName;
	private String lastName;
	
	public User() {
		
	}
	
	public User(int id, String userName, String userPassword, String email, String firstName, String lastName) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
