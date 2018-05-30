package labs;

public class studentDatabase {
	
	public static void main(String[] args) {
		Student student1 = new Student("Anjula", "730703");
		System.out.println(student1.getEmail());
		System.out.println(student1.getuserId());
		student1.enroll("Math123");
		student1.enroll("Math231");
		student1.checkBalance();
		student1.showCourses();
		System.out.println(student1.toString());
	}
	
}

class Student {
	private String name;
	private String SSN;
	private String email;
	private static int Id = 1001;
	private String userId;
	private String courses = "";
	private static final int costOfCourse = 600;
	private int balance = 0;
	
	public Student (String name, String SSN) {
		setEmail(name);
		setName(name);
		setSSN(SSN);
		setuserId();
		Id++;
	}
	
	public void setEmail( String name) {
		this.email = name.toLowerCase() + "@csi.cuny.edu";
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setuserId() {
		int random = (int) (Math.random() * (9000 - 1000));
		this.userId = Id + "" + random + SSN.substring(SSN.length()-4,SSN.length());	
	}
	public String getuserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		this.SSN = sSN;
	}
	
	public void enroll(String course) {
		this.courses += " " + course;
		balance = balance + costOfCourse;
	}
	
	public void checkBalance() {
		System.out.println(balance);
	}
	
	public void payTution(int amount) {
		balance -= amount;
		System.out.println("You paid $" + amount);
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
	
	@Override
	public String toString() {
		return "Name : " + name + ", email : " + email + ", User_ID : " + userId + ", Courses : " + courses + ", Balance : " + balance;
	}
}
