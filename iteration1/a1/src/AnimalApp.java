import javax.swing.JFrame;

@SuppressWarnings("serial")
public class AnimalApp extends JFrame {
	
	public AnimalApp(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AnimalPanel animalPane = new AnimalPanel();
		this.add(animalPane);
		this.pack();
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new AnimalApp("AnimalApp");
		
	}
}
