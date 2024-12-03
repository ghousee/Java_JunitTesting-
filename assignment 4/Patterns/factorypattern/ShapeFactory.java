package factorypattern;
public class ShapeFactory {
	
	//use getShape method to get object of type shape 
	public Shape getShape(String shapeType){
		if(shapeType == null){
			return null;
		}		
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			System.out.println("Circle draw called!");
			return new Circle();
         
		} else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			System.out.println("Rectangle draw called!");
			return new Rectangle();
         
		} else if(shapeType.equalsIgnoreCase("SQUARE")){
			System.out.println("Square draw called!");
			return new Square();
		}
      
		return null;
	}
}
