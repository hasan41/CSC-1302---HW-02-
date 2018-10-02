
public class Exchange extends Undergraduate {
	public Exchange(String major, double gpa, int creditHours, boolean honors, String country, String year) {
		super(major, gpa, creditHours, honors);
		this.country = country;
		this.year = year;
	}

	private String country;
	private String year;
	
	public String getYear() {
		return super.getYear();  
	}
	
	public String getCountry() {
		return country;
	}
	
	public String toString() {
		return country;
	}
	
}
