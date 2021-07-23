package WorkFusion;

public class Marrey {

	public static void main(String[] args) {
	//	int[] values = {2,4,6};
	//	System.out.println(values[2]);
		
		String[][] text = new String[2][2];
		text[0][0] = "Hello Vineet";
	//	System.out.println(text[0][1]);
		
		for (int row =0; row<text.length; row++) {
			for(int col = 0; col<text[row].length; col++) {
				System.out.print(text[row][col] + "\t");
				
			}
			System.out.println("");
		}

	}

}
