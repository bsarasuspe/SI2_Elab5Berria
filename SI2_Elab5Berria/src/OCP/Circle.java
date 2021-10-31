package OCP;

public class Circle implements Figure {
	float diameter;
	
	public Circle(float d) {
		diameter=d;
	}

	@Override
	public void draw() {
		System.out.println("Zirkulua marraztu");
		
	}

	@Override
	public double getArea() {
		return Math.PI*(diameter/2)*(diameter/2);
	}
}
