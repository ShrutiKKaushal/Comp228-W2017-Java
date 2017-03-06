package week8;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame {
	private final JTextField textField1;
	private final JTextField textField2;
	private final JTextField textField3;
	private final JPasswordField passwordField;
	
	  // TextFieldFrame constructor adds JTextFields to JFrame
	   public TextFieldFrame()
	   {
	      super("Testing JTextField and JPasswordField");
	      setLayout(new FlowLayout());

	      // construct textfield with 10 columns
	      textField1 = new JTextField(10); 
	      add(textField1); // add textField1 to JFrame

	      // construct textfield with default text
	      textField2 = new JTextField("Enter text here");
	      add(textField2); // add textField2 to JFrame

	      // construct textfield with default text and 21 columns
	      textField3 = new JTextField("Uneditable text field", 21);
	      textField3.setEditable(false); // disable editing
	      add(textField3); // add textField3 to JFrame
	      
	      // construct passwordfield with default text
	      passwordField = new JPasswordField("Hidden text");
	      add(passwordField); // add passwordField to JFrame
	      
	      TextFieldHandler handler = new TextFieldHandler();
	      textField1.addActionListener(handler);
	      textField2.addActionListener(handler);
	      textField3.addActionListener(handler);
	      passwordField.addActionListener(handler);
	   }
	   
	private class TextFieldHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = "";
			
			if(e.getSource()==textField1)
			{
				str = String.format("textField1: %s", e.getActionCommand());
			}
			
			else if(e.getSource() == textField2)
			{
				str = String.format("textField2: %s", e.getActionCommand());
			}
			else if(e.getSource() == textField3)
			{
				str = String.format("textField3: %s", e.getActionCommand());
			}
			else if(e.getSource() == passwordField)
			{
				str = String.format("passwordField: %s", e.getActionCommand());
			}
			JOptionPane.showMessageDialog(null,str);
		}
		
	}
}

