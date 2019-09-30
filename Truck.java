package inheritDemos;

public class Truck extends Vehicle {

	private String type;
	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public Truck(String colour, int noOfWheels, String model) {
		super(colour, noOfWheels, model);
		// TODO Auto-generated constructor stub
	}
	public void display()
	{
		System.out.println("This is a truck");
	}

	public Truck(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Truck [type=" + type + ", getColour()=" + getColour() + ", getNoOfWheels()=" + getNoOfWheels()
				+ ", getModel()=" + getModel() + "]";
	}

	
	
	

	
}
