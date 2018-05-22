import java.util.Scanner;

class CheckOutDetails{
String movie;
String DateReturn;
double CostOfMovie;
int latefee;

	public void CheckOutDetailsMethod(){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter name of movie: ");
		String movie = input.nextLine();
		System.out.print("Date needing to be returned: ");
		String DateReturn = input.nextLine();
		System.out.print("Enter cost of movie: ");
		double CostOfMovie = input.nextDouble();
		int latefee = (int) (CostOfMovie * .5);
		System.out.print("Late fee if not returned: $" + latefee);


		};
	}




