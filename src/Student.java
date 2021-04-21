public class Student extends User {
	private int regNo;
	private int regYear;
	private String[] studentCourses;
	private int bookedPC;

	public Student(String firstName, String lastName, String username, String password, int regNo, int regYear,
			String[] studentCourses, int bookedPC) {
		super(firstName, lastName, username, password);
		this.setRegNo(regNo);
		this.setRegYear(regYear);
		this.setStudentCourses(studentCourses);
		this.setBookedPC(bookedPC);
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public int getRegYear() {
		return regYear;
	}

	public void setRegYear(int regYear) {
		this.regYear = regYear;
	}

	public String[] getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(String[] studentCourses) {
		this.studentCourses = studentCourses;
	}

	public int getBookedPC() {
		return bookedPC;
	}

	public void setBookedPC(int bookedPC) {
		this.bookedPC = bookedPC;
	}

}

