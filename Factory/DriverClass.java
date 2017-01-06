package factory;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		ShapeFactoryClass obj = new ShapeFactoryClass();
		ShapeInterface shape = obj.getShape(input);

		shape.draw();
	}

}
