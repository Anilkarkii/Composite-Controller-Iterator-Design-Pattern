package DesignPattern;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
/*
 * myFrame extends the JFrame which has two panel: 
 * one for button and circle (used boarder layout) and other is the drawing panel.
 * Action listener is added to each button which identifies the button we selected.
 * drawing panel has mouse listener which operates on getting 
 * signal of action listener with the help of controller object
 */
public class myFrame extends JFrame {

private static final long serialVersionUID = 1L;
public static String buttonName;
public myFrame() {
		
		setTitle("HW1 GUI");
		setSize(800,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		
		JFrame frame= new myFrame();
		JPanel buttonPanel= new JPanel();
		JPanel drawingAreaPanel= new drawingPanel();
		
		
		Border buttonBorder=BorderFactory.createLineBorder(Color.BLACK,5,true);
		JButton circleButton= new JButton("Circle");
		circleButton.setPreferredSize(new Dimension(200,70));
	    JButton rectangleButton= new JButton("Rectangle");
	    rectangleButton.setPreferredSize(new Dimension(200,70));
		
		buttonPanel.add(circleButton);
		buttonPanel.add(rectangleButton);
		
		buttonPanel.setBackground(Color.GRAY);
		buttonPanel.setPreferredSize(new Dimension(240,500));
		
		frame.add(buttonPanel, BorderLayout.WEST);
		frame.add(drawingAreaPanel);
		
		
		ActionListener listener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent AE) {
				 buttonName=AE.getActionCommand();
				System.out.println(buttonName);
				
				
			}
			
		};
		rectangleButton.addActionListener(listener);
		circleButton.addActionListener(listener);
		frame.setVisible(true);
		

	}

}
class drawingPanel extends JPanel
{
	
	private static final long serialVersionUID = 1L;
	Point point=null;
	public drawingPanel() {
		  addMouseListener(new MouseAdapter(){ 
			  @Override
			  public void mousePressed(MouseEvent e)  
		  { point = new Point(e.getX(), e.getY());               
		  repaint();        
		  }  });
	}
	
	
	
	 @Override     
	 public void paintComponent(Graphics g) 
	 {        
		 //Clear the drawing panel for drawing each time we iterate through the list of shapes stored in composite
		 super.paintComponent(g);       
		 if(point!=null) { 
			 Controller controller= new Controller(myFrame.buttonName,point,g);
			 controller.drawAllShapesController(g);
			 
	 }
    

	 }
}
	
