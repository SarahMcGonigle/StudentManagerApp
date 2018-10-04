package ie.gmit.studentmanager;

public class StudentManager {
	
	//create an array to hold student objects
	private static final int INITIAL_CAPACITY = 10;
	private Student[] students = null;
	private int [] studentAges;
	
	//Constructor
	public StudentManager() {
		students = new Student[INITIAL_CAPACITY];
		
	}
	
	//Create methods you may need and stub them out
	
	public boolean add(Student student) {
		return false;
	}
	
	public boolean delete(String studentId) {
		return false;
	}
	
	public Student[] getStudentByFirstName(String firstName) {
		return null;
	}
	
	public int findTotalStudents() {
		return -1;
	}
}
