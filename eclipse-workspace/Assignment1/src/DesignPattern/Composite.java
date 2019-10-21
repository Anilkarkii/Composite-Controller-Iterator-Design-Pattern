package DesignPattern;

import java.awt.Graphics;
import java.util.List;
import java.util.ListIterator;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Composite class has the list that stores the shapes
 */

public class Composite extends Shape{

	@Override
	public void draw(Graphics g) {}
	
	public static List<Shape> list=new ArrayList<>(); ;
	
	/*
	 * This method add the circle and rectangle object on list
	 */
	public void addShapeNPoint(Shape s) {
		list.add(s);
		
		System.out.println("Shape and point added");
		System.out.println(list);
	}
	
	/*
	 * This method iterate through the list and draw the respective shape on drawing panel.
	 */
	
	
	public void drawAllShapes(Graphics g) 
	{
		
		ListIterator<Shape> litr = null;
		litr=list.listIterator();
		  
		while(litr.hasNext()){
        	
        	Shape shape=(Shape)litr.next();
        	shape.draw(g);;
        	
		
        }
	}

	
	
	

	
}
