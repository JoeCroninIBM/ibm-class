/**
 * 
 */
package com.lq.exercises;

/**
 * @author Student
 *
 */
public class Lab3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//String[] daysOfWeek = new String[] {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		/*
		for ( int day = 0; day < daysOfWeek.length ; day++) {
		
			System.out.println( daysOfWeek[day] );
		*/	
		//for (String day: daysOfWeek) {
		//	System.out.println(day);
		//}
		
		//EXCERCISE 4
		
		int month = 1;
		
		//String[] monthNames = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
		
		while (month <=12) {
			
			//System.out.println (monthNames[month] ) ;
			
			switch (month) {
			
			case 1: 
			case 3: 
			case 5: 
			case 7: 
			case 8: 
			case 10: 
			case 12:
				    System.out.println("Month " + month + " has 31 days");
				    break;
			case 2: 
				    System.out.println("Month " + month + " has 28 days");
				    break;
			case 4: 
			case 6: 
			case 9: 
			case 11:
					System.out.println("Month " + month + " has 30 days");
					break;
			default:
					System.out.println("Invalid month: " +month);
			}
			month++;
		}
 	}
}

