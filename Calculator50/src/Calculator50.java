import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Calculator50 extends JFrame implements ActionListener
{
	// Create global variables
	public double b = 0.0;
	public double c = 0.0;
	public double answer = 0.0;
	int f = 0;
	
	// Default operation
	public String operator = "+";
	
	// Flag to clear text in text field after starting a new operation
	public int key_pressed = 0;	

	// Create UI elements
	JFrame frame = new JFrame("Calculator50");
	JTextField title = new JTextField("IIII Chain Calculator");
	JTextField old_text = new JTextField();
	JTextField text = new JTextField();
	
	// Add Top Panel
	JPanel text_panel = new JPanel();

	// Create UI colors
	java.awt.Color dark_purple = new java.awt.Color(165, 55, 253);
	java.awt.Color light_purple = new java.awt.Color(211, 104, 240);
	java.awt.Color darker = new java.awt.Color(30, 30, 30);
	java.awt.Color lighter = new java.awt.Color(45, 45, 45);
	
	// Create Each Button And Set Its Display Text using JButton(String text)
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton b0 = new JButton("0");
	JButton bAdd = new JButton("+");
	JButton bSub = new JButton("-");
	JButton bMul = new JButton("x");
	JButton bDiv = new JButton("/");
	JButton bSin = new JButton("sin");
	JButton bCos = new JButton("cos");
	JButton bTan = new JButton("tan");
	JButton bSq = new JButton("x²");
	JButton bPow = new JButton("x³");
	JButton bSqrt = new JButton("Sqrt");
	JButton bMod = new JButton("Mod");
	JButton bBck = new JButton("<-");
	JButton bClr = new JButton("C");	
	JButton bDec = new JButton(".");
	JButton bSign = new JButton("±");
	JButton bEq = new JButton("=");
	
	// Create An Array Of All Buttons (except theme buttons)
    JButton buttons[] = new JButton[]{b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bSq, bPow, bSqrt, bMod, bDec, bSign, bEq, bClr, bSin, bCos, bTan , bBck, bAdd, bSub, bDiv, bMul};
	
    Calculator50()
	{
    	
    	// Otherwise wouldn't add things to text panel
    	text_panel.setLayout(null);
    	
    	
		// Align text to the right
		text.setHorizontalAlignment(JTextField.RIGHT);
		old_text.setHorizontalAlignment(JTextField.RIGHT);
		
		// Setting the boundaries for each button using setBounds(x, y, width, height)
        text_panel.setBounds(0, 0, 360, 160);
        title.setBounds(10, 0, 290, 50);
        old_text.setBounds(20, 50, 317, 30);
        text.setBounds(20, 90, 317, 67);
        
        // Row 1
        bSin.setBounds(10, 170, 85, 40);
        bCos.setBounds(95, 170, 85, 40);
        bTan.setBounds(180, 170, 85, 40);
        bBck.setBounds(265, 170, 85, 40);
        
        // Row 2
        bSq.setBounds(10, 220, 118, 40);
        bPow.setBounds(138, 220, 117, 40);
        bClr.setBounds(265, 220, 85, 40);
        
        // Row 3
        bSqrt.setBounds(10, 270, 118, 40);
        bMod.setBounds(138, 270, 117, 40);
        bAdd.setBounds(265, 270, 85, 40);
        
        // Row 4
        b7.setBounds(10, 320, 75, 40);
        b8.setBounds(95, 320, 75, 40);
        b9.setBounds(180, 320, 75, 40);
        bSub.setBounds(265, 320, 85, 40);

        // Row 5
        b4.setBounds(10, 370, 75, 40);
        b5.setBounds(95, 370, 75, 40);
        b6.setBounds(180, 370, 75, 40);
        bMul.setBounds(265, 370, 85, 40);

        // Row 6
        b1.setBounds(10, 420, 75, 40);
        b2.setBounds(95, 420, 75, 40);
        b3.setBounds(180, 420, 75, 40);
        bDiv.setBounds(265, 420, 85, 40);

        // Row 7
        bSign.setBounds(10, 470, 75, 40);
        b0.setBounds(95, 470, 75, 40);
        bDec.setBounds(180, 470, 75, 40);
        bEq.setBounds(265, 470, 85, 40);
        
        // Set Text Panel Color
        text_panel.setBackground(lighter);

        // Set Text Field Color
        text.setBackground(lighter);
        text.setForeground(Color.white);
        text.setBorder(null);
        
        // Set upper text color
        old_text.setBackground(lighter);
        old_text.setForeground(light_purple);
        old_text.setBorder(null);
        
        // Set title color
        title.setBackground(lighter);
        title.setForeground(Color.WHITE);
        title.setBorder(null);

        // Set Text Field Font Type and Size
        text.setFont(new Font("Arial", Font.BOLD, 40));
        
        // Set upper text font
        old_text.setFont(new Font("Arial", Font.PLAIN, 18));
        
        // Set title font
        title.setFont(new Font("Arial", Font.BOLD, 25));

        // Make text field non writable with a keyboard
        text.setFocusable(false);
        old_text.setFocusable(false);
        title.setFocusable(false);

        // Add title and theme button to the text panel
        text_panel.add(title);
        
        // Add Text Panel to Frame
        frame.add(text_panel);        
        
        // Set Frame Color
        frame.getContentPane().setBackground(darker);

        // Set Frame Icon
        frame.setIconImage(new ImageIcon("icon.png").getImage());

        // Cycle Through All Buttons (besides theme buttons)
        for (int i = 0; i < 26; i++)
        	{
        		// Add Button To The Main Frame
        		frame.add(buttons[i]);

        		if (i > 15)
        		{
        			if (i == 16)
        			{
            			// Set Button Color
            			buttons[i].setBackground(light_purple);       				
        			}
        			else
        			{
        				// Set Button Color
        				buttons[i].setBackground(dark_purple);
        			}
        			
        			// Set Button Font Color
        			buttons[i].setForeground(Color.white);
        			
        			// Set Button Font Style And Size
        			buttons[i].setFont(new Font("Arial", Font.ITALIC, 17));
        		}
        		else
        		{   
        			// Set Button Font Style And Size
        			buttons[i].setFont(new Font("Arial", Font.BOLD, 17));
        		
        			// Set Button Color
        			buttons[i].setBackground(new java.awt.Color(45, 45, 45));
        			
        			// Set Button Font Color
        			buttons[i].setForeground(dark_purple);
        		}
        		
        		// Save Button Font Color
        		buttons[i].setOpaque(true);
        		buttons[i].setBorderPainted(false);
        		 		
        		// Get Rid Of Ugly Background When Button Is Pressed
        		buttons[i].setFocusPainted(false);        		

         		// Add Action Listener For Button
        		buttons[i].addActionListener(this);       		

        	}
        
        // Add The text Field To The Main Frame
        frame.add(text);
        frame.add(old_text);
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set Frame Size
        frame.setSize(373, 560);
        frame.setResizable(false);
	}
	
    
    // Do non instant operations
    public double operation(String operator, double a, double b )
    {
    	switch(operator)
    	{
    		case "+":
    			answer = a + b;
    			break;
    		
    		case "-":
    			answer = a - b;
    			break;
			
    		case "*":
    			answer = a * b;
    			break;
    		
    		case "/":
    			answer = a / b;
    			break;
    		
    		case "+/-":
    			a /= 100;
    			break;   
    		
    		case "Mod":
    			answer = a % b;
    			break;
    			
    		case "=":
    			text.setText(String.valueOf(answer));
    			answer = 0.0;
    			break;
		}
    	
    	// Round answer
		answer = Math.round(answer*100000000.0)/100000000.0;
    	return answer;	 
    }
    
    
    // Do instant operations
    public double inst_operation(String operator, double a)
    {
    	switch(operator)
    	{
    		case "sin":
    			b = Math.toRadians(b);
    			c = Math.sin(b);
    			break;
    		
    		case "cos":
    			b = Math.toRadians(b);
    			c = Math.cos(b);
    			break;
    		
    		case "tan":
    			b = Math.toRadians(b);
    			c = Math.tan(b);
    			break;
    			
    		case "^2":
    			c = Math.pow(b, 2);
    			break;
    			
    		case "^3":
    			c = Math.pow(b, 3);
    			break; 
    		
    		case "Sqrt":
    			c = Math.sqrt(b);
    			break;
		}
    	
    	// Round answer
    	c = Math.round(c*100000000.0)/100000000.0;
    	return c;	 
    }
    
    
	@Override
	public void actionPerformed(ActionEvent e)
	{

		// Make Buttons Write in Text Field
		for (int i = 0; i < 10; i++)
		{
			String s = text.getText().trim(); 
			if (s.equals("Can't divide by 0") || s.equals("Invalid input"))
			{
	            old_text.setText("");
	            freeze_btn(true);
			}
			
			if (e.getSource() == buttons[i])
			{
				// Flag to remove old numbers
				if (key_pressed == 1)
					{
						// Remove old numbers from the text field
						text.setText("");
						key_pressed = 0;
					}
				text.setText(text.getText().concat(String.valueOf(i)));
			}
		}
		
		// Addition button
		if (e.getSource() == bAdd)
		{
			add_number("+");
		}
		
		// Subtraction button
		if (e.getSource() == bSub)
		{
			add_number("-");
		}
		
		// Multiplication button
		if (e.getSource() == bMul)
		{
			add_number("*");
		}
		
		// Division button
		if (e.getSource() == bDiv)
		{
			add_number("/");
		}
		
		// Power button
		if (e.getSource() == bPow)
		{
			inst_add("^3");
		}
		
		// Square button
		if (e.getSource() == bSq)
		{
			//add_number("^2");
			inst_add("^2");
		}
		
		// Sine button
		if (e.getSource() == bSin)
		{
			inst_add("sin");
		}
		
		// Cosine button
		if (e.getSource() == bCos)
		{
			inst_add("cos");
		}
		
		// Tangent button
		if (e.getSource() == bTan)
		{
			inst_add("tan");
		}
		
		// Root button
		if (e.getSource() == bMod)
		{
			add_number("Mod");
		}
		
		// Square root button
		if (e.getSource() == bSqrt)
		{
			inst_add("Sqrt");
		}
		
		// Sign button
		if (e.getSource() == bSign)
		{
			String s = text.getText().trim();
			if (!s.isEmpty())
			{
				text.setText(String.valueOf(-1 * Double.parseDouble(s)));
			}
		}
		
		// Equal button
		if (e.getSource() == bEq)
		{
			String s = text.getText().trim();
			if (!s.isEmpty())
			{
				b = Double.parseDouble(s);

				if (!(operator.equals("/") && b == 0.0))
				{
					
				// Do latest operation
				operation(operator, answer, b);
				
				// Do operation for "="
				operation("=", answer, b);					
				}
				else
				{
					add_number("/");

				}
				
				// Reset upper text
				old_text.setText("");					
				
				// Set operator to default value
				operator = "+";
				
				// Flag to get rid of upper text
				key_pressed = 1;
			}
		}
		
		// Clear button
        if (e.getSource() == bClr)
        {
        	freeze_btn(true);
            text.setText("");
            old_text.setText("");
            operator = "+";
            answer = 0.0;
            b = 0.0;
        }
        
		// Back button
        if (e.getSource() == bBck)
        {
        	// Get the text in the text field
        	String s = text.getText().trim();
        	
        	// Get rid of the last character in the text
        	s = s.replaceAll(".$", "");
        	
        	// Set text to the shortened text
        	text.setText(s);
        }
        
        // Decimal button
        if (e.getSource() == bDec)
        {
        	// Get the text in the text field
        	String s = text.getText().trim();
        	
        	// Get rid of the last character in the text
        	s = s + ".";
        	
        	// Set text to the shortened text
        	text.setText(s);
        }
	}
	
	
	// Set up non instant operations
	public int add_number(String op) {
		
		// Get numbers from the text field
		String s = text.getText().trim();

		// Check for old numbers in the text field
		if (!(s.isBlank()))
		{
			key_pressed = 1;
		}
		else
		{			
		// Set first default number to 0
			s = "0.0";
		}
		
		// Check if dividing by zero
		if (operator.equals("/") && Double.parseDouble(s) == 0.0)
		{
			// Add values to upper text
			old_text.setText(old_text.getText() + "0");
			
			operator = "+";
			operation("+", 0, 0);

			// Set text to answer
			text.setText("Can't divide by 0");
			freeze_btn(false);
            return key_pressed;
		}		

		// Set b to current number
		b = Double.parseDouble(s);
		
		// Do operation (default operation is answer + b where answer is 0)
		operation(operator, answer, b);

		// Set text to answer
		text.setText(String.valueOf(answer));

		// Flag for adding answer to upper text when inst_add() runs
		if (f != 1)
		{
			// Add b to upper text
			old_text.setText(old_text.getText() + b);
		}
		else
		{
			f = 0;
		}
		
		// Set the operation (so it executes after pressing the next button)
		operator = op;			
		
		// Add operation sign to upper text
		old_text.setText(old_text.getText() + " " + operator + " ");
		
		return key_pressed;
	}
	
	
	// Set up instant operations
	public int inst_add(String op)
	{
		String operator = op;
		
		String s = text.getText().trim();
		
		// Set b to current number
		b = Double.parseDouble(s);
		
		// Add values to upper text
		if (operator.equals("^2") || operator.equals("^3"))
		{
			old_text.setText(old_text.getText() + '(' + b + ')' + op);
		}
		else
		{
			old_text.setText(old_text.getText() + op + '(' + b + ')');
		}
		
		if (operator.equals("Sqrt") && b < 0) {
			// Reset operation
			operator = "+";
			operation("+", 0, 0);
			
			// Error message
			text.setText("Invalid input");
			
			// Freeze buttons
			freeze_btn(false);
			key_pressed = 1;
			return f;
		}
		
		// Do operation
		inst_operation(operator, b);
		
		// Display answer in text field
		text.setText(String.valueOf(c));
		
		// Flag to prevent answer for being added to upper text when doing add_number
		f = 1; 
		
		return f;
	}
	
	
	// Freeze buttons after dividing by zero
	public void freeze_btn(boolean fr)
	{
		for (int i = 10; i < 26; i++)
		{
			if (buttons[i] == bClr)
			{
				continue;
			}
			buttons[i].setEnabled(fr);
		}
	}
	
	
	
    public static void main(String[] args) {
        new Calculator50();
    }
}