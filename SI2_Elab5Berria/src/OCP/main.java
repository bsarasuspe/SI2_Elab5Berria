package OCP;

public class main {

	public static void main(String[] args) {
		
		Sheet s = new Sheet();
		
		Circle c= new Circle(3);
		Circle c2= new Circle(4);
		Diamond d =new Diamond(5);
		Square sq = new Square(6);
		
		s.addFigure(c);
		s.addFigure(c2);
		s.addFigure(d);
		s.addFigure(sq);
		
		s.drawFigures();
		s.getArea(); 
	}
}
