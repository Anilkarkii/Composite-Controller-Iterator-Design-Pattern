package DesignPattern;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {
	
	int X;
	int Y;
	/*
	 * Draw the rectangle on the position given by mouse listener
	 */

	public Rectangle(int x, int y) {
		System.out.println("Rectangle constructor called.");
		this.X=x;
		this.Y=y;
	}
	
	@Override
	public void draw(Graphics g) {
		
		g.drawRect(X,Y,40, 40);
		
	}
	
	@Override
	public void addShapeNPoint(Shape s) {}
	@Override
	protected void drawAllShapes(Graphics g) {}
	
}
