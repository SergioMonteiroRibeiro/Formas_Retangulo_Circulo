package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shape = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		Integer shapeNum = sc.nextInt();
		
		for (int i = 0; i < shapeNum; i++) {
			System.out.println();
			System.out.print("Rectangle or Circle (r/c)? ");
			sc.nextLine();
			char option = sc.nextLine().charAt(0);
			
			System.out.print("Color (BLACK|BLUE|RED): ");
			String color = sc.nextLine();
			
			if (option == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				
				System.out.print("Height: ");
				Double height = sc.nextDouble();	
				
				shape.add(new Rectangle(Color.valueOf(color), width, height));
			}
			else {
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				
				shape.add(new Circle(Color.valueOf(color), radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS");
		
		for (Shape shp : shape) {
			System.out.println(String.format("%.2f", shp.area()));
		}
		
		sc.close();
	}
}
