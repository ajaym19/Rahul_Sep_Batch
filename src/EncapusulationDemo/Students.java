package EncapusulationDemo;

public class Students {

	private int studentId; //R >> No, W >> No
	private int rollNo; // R >> Yes, W >> No
	private String studentName; // R >> Yes, W >> No
	private String schoolName; //R yes, w, no
	private int phoneNumber; //r yes, w, yes
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		
		//check on the data
		this.phoneNumber = phoneNumber;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	
	//capsule
	

	
}
