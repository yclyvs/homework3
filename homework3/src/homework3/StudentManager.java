package homework3;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("�grenci eklendi. Kullan�c� ad�:" + user.getUserName());
	}
	
}
