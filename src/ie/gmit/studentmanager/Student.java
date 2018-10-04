package ie.gmit.studentmanager;

public class Student {
	
	//Instance Variables
	private String name;
	private int age;
	private String address;
	private String studentId;

	//Default Constructor
		public Student() {
			name = null;
			age = 0;
			address = null;
			studentId = null;
		}
		
		//Getters and Setters for name
		public String getName() {
			return this.name; //Stores name
		}	
		
		public void setName(String newName) {
			name = newName;
		}
		
		//Getters and Setters for Age
		public int getAge() {
			return age; //Stores id
		}
		
		public void setAge(int newAge) {
			this.age = newAge;
		}
}
