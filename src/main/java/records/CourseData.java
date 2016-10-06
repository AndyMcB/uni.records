package records;

import java.util.ArrayList;
import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class CourseData {
	
	private final DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd");
	private String courseName;
	private ArrayList<ModuleData> modules = new ArrayList();
	private LocalDate startDate;
	private LocalDate endDate;
	
	public CourseData(String name, String start, String end ){
		this.courseName = name;
		this.startDate = dtf.parseLocalDate(start);
		this.endDate = dtf.parseLocalDate(end);
	}
	
	public String toString(){
		return this.courseName + " has the following modules:\n " + modules.toString() 
				+"\nDates: " + this.startDate + " until " + this.endDate;
				
	}
	
	public void addModule(ModuleData md){
		modules.add(md);
	}

	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public ArrayList<ModuleData> getModules() {
		return modules;
	}

	public void setModules(ArrayList<ModuleData> modules) {
		this.modules = modules;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	
	

}
