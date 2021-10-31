package OCP;

public class Diamond implements Figure {
	float length;
	
	public Diamond(float d) {
		length=d; 
	}
	
	@Override
	public void draw() {
		System.out.println("Diamantea marraztu");
	}

	@Override
	public double getArea() {
		return length*length;
	}

}
