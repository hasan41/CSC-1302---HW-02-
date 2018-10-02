
public class Graduate extends Student{

	public Graduate(String major, double gpa, String degree, String concentration, int years) {
		super(major, gpa, 0);
		this.degree = degree;
		this.concentration = concentration;
		this.years = years;
		// TODO Auto-generated constructor stub
	}

	private String degree;
	private String concentration;
	private int years;
	
	public int getYears() {
		return years;
	}
	
	public String getConcentration() {
		return concentration;
	}

}

// int years, String degree, String concentration, int years
