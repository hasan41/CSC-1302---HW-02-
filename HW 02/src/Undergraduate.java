
public class Undergraduate extends Student{
	public Undergraduate(String major, double gpa, int creditHours, boolean honors) {
		super(major, gpa, creditHours);
		this.honors = honors;
		// TODO Auto-generated constructor stub
	}

	private boolean honors;
	
	public boolean isHonors() {
		return honors;
	}
	public String toString() {
		return "Major: " + getMajor() + ", gpa" + getGpa() + ", creditHours" + getCreditHours() ;
	}
}
