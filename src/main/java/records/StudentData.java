package records;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentData {
	
	private String name;
	private Integer age;
	private LocalDate dob;
	private CourseData course;
	private String userName;
	
	private final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	public StudentData(String nme, int age, String birth ){
		this.name = nme;
		this.age = age;
		this.dob = LocalDate.parse(birth, DTF);
		this.userName = generateUsername();
	}
	
	public String toString(){
		return "Name: "+this.name + "\nAge: "+ this.age + "\nDOB: "+this.dob + "\nUsername: "+this.userName+"\n";
	}
	
	private String generateUsername(){
		return this.name.concat(age.toString()).trim();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
		userName = generateUsername(); //regenerate username
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
		userName = generateUsername(); //regenrate username
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}

}
