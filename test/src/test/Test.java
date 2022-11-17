package test;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {

		 LocalDate date
         = LocalDate.parse("2018-11-13");
		// print instance
	        System.out.println("LocalDate before"
	                           + " subtracting days: " + date);
	  
	        // subtract 17 days
	        LocalDate returnvalue
	            = date.minusDays(1);
	  
	        // print result
	        System.out.println("LocalDate after "
	                           + " subtracting days: " + returnvalue);

	}

}
