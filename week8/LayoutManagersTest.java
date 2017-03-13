package week8;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LayoutManagersTest extends JFrame {

	//Variable
	private JPanel pNorth, pSouth, pEast, pWest, pCenter;
	private JLabel lblName, lblPosition;
	private JTextField txtName, txtPosition;
	private JButton left, center, right, bEast, bWest, bSouth1, bSouth2;
	
	// Constructor
		public LayoutManagersTest() {
			super("Multiple layout test");
			
			// Creating new panels for each region
			pNorth = new JPanel();
			pCenter = new JPanel();
			pWest = new JPanel(); 
			pEast = new JPanel();
			pSouth = new JPanel();
			
			// Initialized Buttons
			left = new JButton("Left");
			center = new JButton("Center");
			right = new JButton("Right");
			bWest = new JButton("West");
			bEast = new JButton("East");
			bSouth1 = new JButton("Java Programming");
			bSouth2 = new JButton("COMP228");
			
			/*PANEL NORTH */
			//Register Button Handlers
			ButtonHandler handler = new ButtonHandler();
			left.addActionListener(handler);
			right.addActionListener(handler);
			center.addActionListener(handler);
			
			//Adds Components to panel
			pNorth.add(left);
			pNorth.add(right);
			pNorth.add(center);
			pNorth.setBackground(Color.RED);
			
			/* PANEL CENTER */
			pCenter.setLayout(new GridLayout(2,2,5,5));
			
			lblName = new JLabel("Name: ");
			lblPosition = new JLabel("Position: ");
			txtName = new JTextField(20);
			txtPosition = new JTextField(20);
			
			pCenter.add(lblName);
			pCenter.add(txtName);
			pCenter.add(lblPosition);
			pCenter.add(txtPosition);
			
			pCenter.setBackground(Color.GREEN);
			
			/* PANEL EAST */
			pEast.add(bEast);
			pEast.setBackground(Color.ORANGE);
			
			/* PANEL WEST */
			pWest.add(bWest);
			pWest.setBackground(Color.PINK);
			
			/* PANEL SOUTH */
			pSouth.add(bSouth1);
			pSouth.add(bSouth2);
			pSouth.setBackground(Color.LIGHT_GRAY);
			
			// Add Panels to the JFrame
			add(pNorth, BorderLayout.NORTH);
			add(pCenter, BorderLayout.CENTER);
			add(pEast, BorderLayout.EAST);
			add(pWest, BorderLayout.WEST);
			add(pSouth, BorderLayout.SOUTH);
			
			pack();
		}
		
		// Private inner class
		private class ButtonHandler implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == left) {
					pNorth.setLayout(new FlowLayout(FlowLayout.LEFT));
				} 
				else if (e.getSource() == center) {
					pNorth.setLayout(new FlowLayout(FlowLayout.CENTER));
				}
				else if(e.getSource() == right) {
					pNorth.setLayout(new FlowLayout(FlowLayout.RIGHT));
				}
				
				pNorth.validate();
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LayoutManagersTest testLayoutManagers1 = new LayoutManagersTest();
		testLayoutManagers1.setTitle("TESTING LAYOUT MANAGERS");
		testLayoutManagers1.setSize(500, 300);
		testLayoutManagers1.setVisible(true);
		
	}

}


