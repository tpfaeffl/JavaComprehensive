package Homework_5_Sales_Report;

/* 
 * Thomas Pfaeffle
 * Java Comprehensive
 * Homework 5
 * 
 */

public class ReportApp {

	public static void main(String[] args) {
		System.out.println("Sales by region:");
		Sales.getSalesByRegion();
		System.out.println();
		
		System.out.println("Sales by quarter:" );
		Sales.getSalesByQuarter();
		System.out.println();
		
		Sales.getTotalSales();
		System.out.println();
		
		

	}

}
