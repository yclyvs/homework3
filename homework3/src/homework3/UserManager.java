package homework3;

public class UserManager {
	
	
	public void add(User user) {
		System.out.println("Kullan�c� eklendi. Kullan�c� ad�:" + user.getUserName());
	}
	public void delete(User user) {
		System.out.println("Kullan�c� silindi. Kullan�c� ad�:" + user.getUserName());
	}
	
	public void logIn(User user) {
		System.out.println("Kullan�c� giri�i yap�ld�. Kullan�c� ad�:" + user.getUserName());
	}
	
	public void addMulti(User[] users) {
		for (User user : users) {
			System.out.println("Kullan�c� eklendi. Kullan�c� ad�:" + user.getUserName());
		}
	}
	
	public void deleteMulti(User[] users) {
		for (User user : users) {
			System.out.println("Kullan�c� silindi. Kullan�c� ad�:" + user.getUserName());
		}
	}
	
}	
