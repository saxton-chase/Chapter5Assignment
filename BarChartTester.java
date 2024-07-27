import java.util.Scanner;
public class BarChartTester {

	public static void main(String[] args) {
		//Welome Section
		System.out.print("Welcome to my prgram!!!");
		System.out.print("\nThis program will create a bar chart based on your responses.");
		System.out.print("\n\n");
		//
		Scanner userInput = new Scanner(System.in);//scanner for user input
		int number;//will be used for length of bar(asterik)
		
		int i = 0;//initializing counter variable for loop
		
		for (i = 0; i  < 5; i++) {
			System.out.print("Enter a number: ");
			number = userInput.nextInt();
			BarChart barChart = new BarChart(number);
			barChart.displayBar();
			System.out.print("\n");
		}
	}
	

}
