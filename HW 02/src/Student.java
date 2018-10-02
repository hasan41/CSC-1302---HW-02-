
public class Student {
	private String major;
	private double gpa;
	private int creditHours;
	
	public Student(String major, double gpa, int creditHours) {
		this.major = major;
		this.gpa = gpa;
		this.creditHours = creditHours;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public String getMajor() {
		return major;
	}
	
	public int getCreditHours() {
		return creditHours;
	}
	
	public String getYear() {
		if(creditHours < 32)
			return "freshman";
		else if(creditHours > 32 && creditHours < 64)
			return "Sophomore";
		else if(creditHours > 64 && creditHours < 96)
			return "Junior";
		else
			return "Senior";
	}
	
	
	}

	
