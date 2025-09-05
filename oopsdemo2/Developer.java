package oopsdemo2;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 3, 2025
* Time    : 4:21:31 PM
* Project : CoreJava
*/

public class Developer extends Employee{
	
	private String skillSet;
	private String projectName;
	
	public Developer(int empId, String name, String skillSet, String projectName) {
		super(empId, name);  //invoke parent class
		this.skillSet = skillSet;
		this.projectName = projectName;
	}
	
	// method to display developer details
		public void displayDeveloperDetails() {
			// call parent class method
			
			System.out.println("Skill Set: " + skillSet);
			System.out.println("Project Name: " + projectName);
		}
	
	

}
