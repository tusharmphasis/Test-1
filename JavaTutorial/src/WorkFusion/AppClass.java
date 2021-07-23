package WorkFusion;

class Table {
	int tableValue;

	// Subroutine
	void printtableof() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(tableValue + " * " + i + " = " + tableValue * i);
		}
	}
}

public class AppClass {

	public static void main(String[] args) {
		Table table = new Table();
		table.tableValue = 6;
		table.printtableof();

	}

}
