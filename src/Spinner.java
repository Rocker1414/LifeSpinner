import javax.swing.JFrame;

// Michael Gargano
// Chris Rogers
// Game of Life Spinner
// Spins to a random color/number and outputs the results
// in a GUI

public class Spinner {
	public static void main(String[] args) {
		
		RandSpin rando = new RandSpin();
		
		int num = rando.getNum();
		String color = rando.getColor();
		
		GuiWork gui = new GuiWork(num, color);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(275,180);
		gui.setVisible(true);
		
	}
}
