package homework3;

public class InstructorManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println("E�itimci eklendi. Kullan�c� ad�:" + user.getUserName());
	}
}
