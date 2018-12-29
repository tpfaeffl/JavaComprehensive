package Homework_5_Sales_Report;

/* 
 * Thomas Pfaeffle
 * Java Comprehensive
 * Homework 5
 * 
 */

public class Sales {
	
	public static double[][] sales = {{1, 1540, 2010, 2450, 1845},{2, 1130, 1168, 1847, 1491}, {3, 1580, 2305, 2710, 1284}, {4, 1105, 4102, 2391, 1576} };

	public Sales() {
	// this.sales = sales;
	}
	
	public static void getSalesByRegion() {
		for (int i = 0; i < sales.length; i++ ) {
			double sum = 0;
			for (int j = 1; j < sales[i].length; j++) {
				sum += sales[i][j];	
			}
			System.out.println("Region " + (i+1) + ":  " + Formatter.formatAmount(sum));
		}
	}
	
	public static void getSalesByQuarter() {

		for (int i = 1; i <= sales.length; i++ ) {
			double sum = 0;
			for (int j = 0; j < sales[0].length-1; j++) {
				sum += sales[j][i];	
				
			}
			System.out.println("Q" + (i) + ":  " + Formatter.formatAmount(sum));
		}
	}
	
	public static void getTotalSales() {
		 double sum = 0;
		    for (int i=0; i < sales.length; i++) {
		        for (int j=1; j < sales[i].length; j++) {
		            sum += sales[i][j];
		        } 
		    }
		 System.out.println("Total annual sales, all regions: " + Formatter.formatAmount(sum));	   
	}
	
}


	

