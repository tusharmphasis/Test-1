package WorkFusion;

class Robot {
	int Empage;
	public Robot(int age) {
			setAge(age);
			System.out.println(this.Empage);
	}
	public void setAge(int age) {
		Empage = age;
	}
	
}

public class App {

	public static void main(String[] args) {
		new Robot(2);
		

	}

}
