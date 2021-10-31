package OCP;

import java.util.Enumeration;
import java.util.Vector;

public class Sheet {

	Vector<Figure> figures= new Vector<Figure>();
	
	public void addFigure(Figure f) {
		figures.add(f); 
	}
	
	public void drawFigures(){
		
		Enumeration<Figure> eFigures=figures.elements();
		Figure f;
		
		while (eFigures.hasMoreElements()){
			f=eFigures.nextElement();
			f.draw();
		}
	}
	
	public void getArea() {
		
		Enumeration<Figure> eFigures=figures.elements();
		Figure f;
		
		while (eFigures.hasMoreElements()){
			f=eFigures.nextElement();
			System.out.println(f.getArea());
		}
	}
}
