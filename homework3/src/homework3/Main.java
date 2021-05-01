package homework3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student();
		Student student2 = new Student();
		Instructor instructor1 = new Instructor();
		Instructor instructor2 = new Instructor();
		
		student1.setId(13);
		student1.setFirstName("Yücel");
		student1.setLastName("YAVAŞ");
		student1.setEmail("y@y.com");
		student1.setUserName("yclyvs");
		student1.setUserPassword("123abc");
		student1.setStudentNumber("20210001");
		
		student2.setId(14);
		student2.setFirstName("Funda");
		student2.setLastName("ALTUN");
		student2.setEmail("f@y.com");
		student2.setUserName("fndaltn");
		student2.setUserPassword("456def");
		student2.setStudentNumber("20210002");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.delete(student1);
		studentManager.logIn(student1);
		
		instructor1.setId(23);
		instructor1.setFirstName("Hasan");
		instructor1.setLastName("CAN");
		instructor1.setEmail("h@y.com");
		instructor1.setUserName("hsncn");
		instructor1.setCertificate("Hacettepe Univercity");
		instructor1.setSalary(12000);
		
		instructor2.setId(24);
		instructor2.setFirstName("Fatma");
		instructor2.setLastName("TAN");
		instructor2.setEmail("f@y.com");
		instructor2.setUserName("ftmtn");
		instructor2.setCertificate("Boğaziçi Univercity");
		instructor2.setSalary(14000);
		

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.delete(instructor1);
		instructorManager.logIn(instructor1);
		
		
		UserManager userManager = new UserManager();
		userManager.add(instructor2);
		userManager.add(student2);
		
		User[] users = {student1,instructor1};
		userManager.addMulti(users);
		studentManager.addMulti(users);
		instructorManager.addMulti(users);
		
	}

}
