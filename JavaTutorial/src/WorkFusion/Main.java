package WorkFusion;

public class Main {

	public static void main(String[] args) {
		int table = 7;  // Table Name
		printTable(table);
		printTriangleStar(table);
		
	}
	  
	  private static void printTable(int table) {
		    System.out.println("Printing Table of" + table +"!");
			System.out.println("-------------------");
			
			for(int counter = 1;counter<=10;counter++) {
				System.out.println(table + " * " + counter + " = " + table*counter);
			}
		
	}
	  
	  // Print Triangle Star
	  private static void printTriangleStar(int StarNumber) {
		  for(int counter = StarNumber; counter>=1; counter--) {
			 for (int print = 1; print<=counter;print++) {
				 System.out.print("*");
			 }
			 System.out.println();
		  }
	  }
}
