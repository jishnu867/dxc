package inheritDemos;

public class Car extends Vehicle {
private String abs;
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String colour, int noOfWheels, String model) {
		super(colour, noOfWheels, model);
		// TODO Auto-generated constructor stub
	}
	public void display()
	{
		System.out.println("This is a car");
	}

	public Car(String abs) {
		super();
		this.abs = abs;
	}

	public String getAbs() {
		return abs;
	}

	public void setAbs(String abs) {
		this.abs = abs;
	}

	@Override
	public String toString() {
		return "Car [abs=" + abs + ", getColour()=" + getColour() + ", getNoOfWheels()=" + getNoOfWheels()
				+ ", getModel()=" + getModel() + "]";
	}
	
}
