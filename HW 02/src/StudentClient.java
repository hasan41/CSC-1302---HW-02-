
public class StudentClient {

	public static void main(String[] args) {
		
		Undergraduate Maya = new Undergraduate("Computer Science", 3.9, 54, true);
		Graduate John = new Graduate("Masters", 4.10, "Computer Science", "Cybersecurit", 1);
		Exchange Zayn = new Exchange("Dentistry", 3.98 , 52, false, "Pakistan", "2018");

		System.out.println("Maya - Undergraduate: ");
		System.out.println("Major: "+ Maya.getMajor());
		System.out.println("GPA: "+ Maya.getGpa());
		System.out.println("Year: " + Maya.getYear());
		if(Maya.isHonors()) {
			System.out.println("True - This student is an honor student");
		}
		else {
			System.out.println("This student is not an honor student");
		}
		System.out.println("\t OR");
		System.out.println("Honors: "+ Maya.isHonors());

		System.out.print("\n");
		
		System.out.println("John - Graduate: ");
		System.out.println("Degree: "+ John.getMajor());
		System.out.println("Year(s): " + John.getYears());
		System.out.println("GPA: "+ John.getGpa());
		System.out.println("Major: "+ John.getMajor());
		System.out.println("Concentration: " + John.getConcentration());
		
		System.out.print("\n");

		System.out.println("Zayn - Exchange: ");
		System.out.println("GPA: "+ Zayn.getGpa());
		System.out.println("Major: "+ Zayn.getMajor());
		System.out.println("Country: "+ Zayn.getCountry());
		
	}
}

// TODO Auto-generated method stub
/*Student G = new Graduate("Masters", 4.10, "Computer Science", "Cybersecurit", 1);
Student UG = new Undergraduate("Computer Science" , 3.9, 54, true);
Student E = new Exchange("Bandhan", 4.09, 52, true, "Pakistan", "2018");

//Student exchange = new Exchange("Hi",4.09, 52, true, "Pakistan", "2018");

printStudent(G);
System.out.println("John");
System.out.println();
printStudent(UG);
System.out.println();
printStudent(E);

if(((Undergraduate)UG).isHonors()) {
	System.out.println("This student is an Honor student");
}
else {
	System.out.println("This student is not an Honor student");

}

System.out.println(UG.getMajor());
System.out.println(UG.getYear());
System.out.println(UG.isHonors());


}



private static void printStudent(Student s) {
System.out.println(s.getClass().getName());	
System.out.println("GPA: " + ((Student) s).getGpa());
//System.out.println("Country: " + ((Exchange) s).getCountry());
System.out.println("Year: " + ((Student) s).getYear());
}

}
}*/

