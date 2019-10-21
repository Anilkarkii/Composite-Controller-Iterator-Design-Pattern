package DesignPattern;
import java.awt.Graphics;

/*
 * Abstract class and provides access(to get their methods) for controller to the classes that extends Shape.
 */
abstract class Shape {
	
	
	protected int X;
	protected int Y;
	abstract public void draw(Graphics g);
	abstract public void addShapeNPoint(Shape s);
	protected abstract void drawAllShapes(Graphics g);

	



}
