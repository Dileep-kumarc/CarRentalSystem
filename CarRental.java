import java.util.Scanner;

class vechile{
	 String carName;
	 String carModel;
	 double pricePerDay=10;
	
	 vechile(){};

	vechile(String carName,String carModel,double pricePerDay){
		this.carName=carName;
		this.carModel=carModel;
		this.pricePerDay=pricePerDay;
		
	}
	public void displayInfo(int numberDays) {
		System.out.println("Car name:"+carName);
		System.out.println("Car Model:"+carModel);
		System.out.println("Price per day:"+pricePerDay);

	}
	
}

class Car extends vechile{
	
	int numberOfSeats;
	public Car(String carName, String carModel, double pricePerDay,int numberOfSeats) {
		super(carName,carModel,pricePerDay);
		this.numberOfSeats=numberOfSeats;
		
		
	}


	
	public void displayInfo(int numberDays) {
		super.displayInfo(numberDays);
		System.out.println("Number of Seats:"+numberOfSeats);
		System.out.println("Total Rent for"+numberDays+"day(s): ₹"+rent(numberDays, pricePerDay));
		System.out.println("------------------------------------------------");
	}
	

	private double rent(int numberDays,double pricePerDay) {
		
		return numberDays*pricePerDay;
	}
	
}


public class CarRental {
		
	public static void main(String... args) {
		
		Scanner sc = new Scanner(System.in);
		

		Car v1 = new Car ("Swift","Maruthi",1200.00,5);
		Car  v2 = new Car ("i20","Hyndai",1500,5);
		Car  v4 = new Car ("Innova","Toyato",1900,9);
		Car  v3 = new Car ("Nexon","Tata",1700,6);
		
		System.out.println("Welcome to Car Rental System");
		System.out.print("Enter number of days:");
		int days = sc.nextInt();
		System.out.println("---------- Available Cars ----------");
		
		System.out.println("Price for "+days+  " days are prices below");
		System.out.println();
		
		Car  ve []= {v1,v2,v3,v4};
		
		for(int i=0;i<ve.length;i++) {
			ve[i].displayInfo(days);
			
		}
		sc.close();


	}

}
