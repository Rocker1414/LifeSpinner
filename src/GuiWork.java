import javax.swing.*;


import java.awt.*;

public class GuiWork extends JFrame {
	
	private JLabel item1;
	
	public GuiWork(int n, String c){	
		super("Game of Life Spinner (Hi Nola :D)");

		int num = n;
		String color = c;
		
		// Get color from String
		Color col = null;
		try {
			col = (Color) Color.class.getField(color).get(null);
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		setLayout(new FlowLayout());
		
		item1 = new JLabel(Integer.toString(n));
		item1.setFont(new Font("Serif", Font.PLAIN, 72));
		item1.setForeground(col);
		item1.setToolTipText("You rolled a " + color + " " + num);
		add(item1);
	}
}
