package DesignPattern;

import java.awt.Graphics;
import java.awt.Point;
import java.lang.reflect.Constructor;
/*
 * Controller class uses Abstract class i.e. Shape and add all shapes in list as well as
 * provide x and coordinate to the constructors of circle and rectangle 
 */
public class Controller {
	
	
	Shape shape =new Composite();
	
	
	public Controller(String str, Point point,Graphics g){
		System.out.println(str);
		
		try {
			Class<?> cls= Class.forName("DesignPattern."+str);
			Constructor<?> cons = cls.getConstructor(int.class, int.class);
	        Object obj = cons.newInstance(point.x,point.y);
			Shape s=(Shape)obj;
			shape.addShapeNPoint(s);
			
		
		
		} catch (Exception e) {
			
			System.out.println("Come on man!");
		}
		
		
		
	
		
	}
	
	public void drawAllShapesController(Graphics g) 
	{
		shape.drawAllShapes(g);
	}
	
	
	
}
