package homework3;

public class UserManager {
	
	
	public void add(User user) {
		System.out.println("Kullanýcý eklendi. Kullanýcý adý:" + user.getUserName());
	}
	public void delete(User user) {
		System.out.println("Kullanýcý silindi. Kullanýcý adý:" + user.getUserName());
	}
	
	public void logIn(User user) {
		System.out.println("Kullanýcý giriþi yapýldý. Kullanýcý adý:" + user.getUserName());
	}
	
	public void addMulti(User[] users) {
		for (User user : users) {
			System.out.println("Kullanýcý eklendi. Kullanýcý adý:" + user.getUserName());
		}
	}
	
	public void deleteMulti(User[] users) {
		for (User user : users) {
			System.out.println("Kullanýcý silindi. Kullanýcý adý:" + user.getUserName());
		}
	}
	
}	
