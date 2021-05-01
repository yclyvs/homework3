package homework3;

public class InstructorManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println("Eðitimci eklendi. Kullanýcý adý:" + user.getUserName());
	}
}
