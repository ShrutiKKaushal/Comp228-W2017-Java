package week8;
import java.awt.FlowLayout; //specifies how components are arranged
import javax.swing.JFrame; //basic window functionality
import javax.swing.JLabel; //displays text and images
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class LabelFrame extends JFrame {

	//Labels
	private final JLabel label1;
	private final JLabel label2;
	private final JLabel label3;
	
	//Constructor
	public LabelFrame(){
		super("Testing JLabel"); //Title Bar string
		setLayout(new FlowLayout()); //Sets layout of the window
		
		label1 = new JLabel("Label with Text"); //Initializes JLabel with Text
		label1.setToolTipText("This is label1"); //Adds a tool tip to label
		add(label1); //Adds label1 to window
		
		Icon bug = new ImageIcon("Images/bug1.png");
		label2 = new JLabel("Label with Text and icon", bug, SwingConstants.LEFT);
		label2.setToolTipText("This is label2");
		add(label2);
		
		label3 = new JLabel();
		label3.setText("Label with icons and text at bottom");
		label3.setIcon(bug);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("This is label3");
		add(label3);
	}
}
