package records;

import java.util.ArrayList;

public class ModuleData {



	private String moduleName;
	private String moduleCode;
	private String fullModuleName;
	private ArrayList<StudentData> students = new ArrayList<>();
	
	public ModuleData(String name, String code){
		this.moduleName = name;
		this.moduleCode = code;
		this.generateModuleName();
	}
	
	public String toString(){
		return this.fullModuleName;
	}
	
	public void addStudent(StudentData student){
		students.add(student);
	}
	
	private void generateModuleName(){
		this.fullModuleName = this.moduleCode + "-" + this.moduleName;
	}
	
	public ArrayList<StudentData> getStudents(){
		return students;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleCode() {
		return moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	public String getFullModuleName() {
		return fullModuleName;
	}

	public void setFullModuleName(String fullModuleName) {
		this.fullModuleName = fullModuleName;
	}
}
