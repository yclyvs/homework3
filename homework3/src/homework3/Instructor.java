package homework3;

public class Instructor extends User {
	private String certificate;
	private double salary;
	
	public Instructor() {};
	
	public Instructor(String certificate, double salary) {
		super();
		this.certificate = certificate;
		this.salary = salary;
	}
	
	
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	}
