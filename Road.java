package inheritDemos;

public class Road {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.display();
		
		Car c=new Car("Black",4,"autoPilot");
		c.setAbs("Yes");
		c.display();
		System.out.println(c);
		
		Truck t=new Truck("Black",10,"Manual");
		t.setType("waterTanker");
		t.display();
		System.out.println(t);
		
		Bus b=new Bus("Green",8,"Driver");
		b.setSeats(57);
		b.display();
		System.out.println(b);
	}

}
