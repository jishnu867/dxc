package inheritDemos;

public class Bus extends Vehicle {
private int seats;
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(String colour, int noOfWheels, String model) {
		super(colour, noOfWheels, model);
		// TODO Auto-generated constructor stub
	}
	public void display()
	{
		System.out.println("This is a bus");
	}

	public Bus(int seats) {
		super();
		this.seats = seats;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "Bus [seats=" + seats + ", getColour()=" + getColour() + ", getNoOfWheels()=" + getNoOfWheels()
				+ ", getModel()=" + getModel() + "]";
	}
	
}
