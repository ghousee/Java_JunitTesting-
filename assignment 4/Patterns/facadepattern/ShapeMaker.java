package facadepattern;

public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker() {
    	circle = new Circle();
    	rectangle = new Rectangle();
    	square = new Square();
	}

	public String drawCircle(){
    	String cir = circle.draw();
    	return cir;
	}
	
	public String drawRectangle(){
    	String rec = rectangle.draw();
    	return rec;
	}
	
	public String drawSquare(){
    	String squ = square.draw();
    	return squ;
	}
	
}
