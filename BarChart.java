
public class BarChart {
	private int number;

	public BarChart(int number){
		this.number = number;
	}
	public void displayBar(){
		char asterik = '*';//creating the asterik character to be printed
		int i = 0;
		for (i = 0; i < number; i++) {
			System.out.printf("%c",asterik);
		}
	}
}

