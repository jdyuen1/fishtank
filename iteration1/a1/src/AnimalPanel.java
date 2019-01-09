import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class AnimalPanel extends JPanel implements ActionListener {
	private Animal animal;
	private Timer timer;
	public AnimalPanel() {
		super();
		this.setPreferredSize(new Dimension(900, 600));
		animal = new Animal();
		
		this.setBackground(Color.cyan);
		
		timer = new Timer(33, null);
		timer.start();
		
		timer.addActionListener(this);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		animal.drawAnimal(g);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		animal.movement();
		repaint();
		
		if ((animal.xPos > 1000) || (animal.xPos < -250)) {
			animal = new Animal();
		}
		
		else if ((animal.yPos > 700) || (animal.yPos < -200)) {
			animal = new Animal();
		}
	}

}
