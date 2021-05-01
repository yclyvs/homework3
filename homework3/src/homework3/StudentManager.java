package homework3;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("Ögrenci eklendi. Kullanýcý adý:" + user.getUserName());
	}
	
}
