package inheritDemos;

public class Vehicle {

	private String colour;
	private int noOfWheels;
	private String model;
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String colour, int noOfWheels, String model) {
		super();
		this.colour = colour;
		this.noOfWheels = noOfWheels;
		this.model = model;
	}
	public void display()
	{
		System.out.println("These all are my subs");
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Vehicle [colour=" + colour + ", noOfWheels=" + noOfWheels + ", model=" + model + "]";
	}
	

}
