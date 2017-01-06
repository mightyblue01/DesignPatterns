package factory;

public class ShapeFactoryClass {
	
	public ShapeInterface getShape(String inputShape){
		
		if(inputShape == null)
			return null;
		
		if(inputShape.toLowerCase().equals("circle"))
			return new CircleClass();
		else if (inputShape.toLowerCase().equals("triangle"))
			return new TriangleClass();
		else if(inputShape.toLowerCase().equals("square"))
			return new SquareClass();
		
		return null;
	}

}
