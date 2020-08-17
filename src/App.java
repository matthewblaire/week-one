
public class App {

	public static void main(String[] args) {
		
		double price = 5.99;
		double cost = 5.99;
		
		int money = 20;
		int budget = 20;
		
		double newMoney;
		double surplus; 
		
		int friends = 6;
		int rideOrDieHomies = 6;
		
		float friendsPerYear;
		float averageHomies;
		
		int age = 20;
		int yearsOld = 20;
		
		String firstName = "Matthew";
		String givenName = "Matthew";
		
		String lastName = "Blaire";
		String familyName = "Blaire";
		
		char middleInitial = 'C';
		char foreName = 'C';
		
		String fullName;
		String personalName;
		
		fullName = firstName + " " + middleInitial + " " + lastName;
		personalName = givenName + " " + foreName + " " + familyName;
		
		newMoney = money - price;
		surplus = money - price;
		
		friendsPerYear = (friends / (float) age);
		averageHomies = (rideOrDieHomies / (float) yearsOld);
		
		System.out.println("Item price: " + price);
		System.out.println("Item cost: " + cost);
		
		System.out.println("\nMoney in wallet: $" + money);
		System.out.println("Budget: " + budget);
		
		System.out.println("\nAfter purchasing, you will have $" + newMoney + "." );
		System.out.println("If you purchase this item you will have a budget surplus of $" + surplus + ".");
		
		System.out.println("\nFirst name: " + firstName);
		System.out.println("Personal name: " + givenName);
		
		System.out.println("\nMiddle name starts with: " + middleInitial);
		System.out.println("Forename starts with: " + foreName);
		
		System.out.println("\nLast name " + lastName);
		System.out.println("Family name: " + familyName);
		
		System.out.println("\nYour full name is " + fullName + ".");
		System.out.println("Your personal name is " + personalName + ".");
		
		System.out.println("\nYou are " + age + " years old, and have " + friends + " friends.");
		System.out.println("You are " + yearsOld + " years old and have " + rideOrDieHomies + " ride or die homies.");
		
		System.out.println("\nOn average, you made " + friendsPerYear + " friends per year.");
		System.out.println("On average, you gained " + averageHomies + " ride or die homies every year.");
		
		
	}

}
