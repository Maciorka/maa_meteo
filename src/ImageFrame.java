import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class ImageFrame extends JFrame {

	ButtonGroup bg = new ButtonGroup();

	
	public ImageFrame() {
		super("Mapa meteorologiczna");
		
		
		setLayout(new BorderLayout(20,20));
		
		ImagePanel obrazPanel = new ImagePanel();
		ButtonPanel buttonPanel = new ButtonPanel(obrazPanel);
		
		add(obrazPanel, BorderLayout.WEST);
		add(buttonPanel, BorderLayout.EAST);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
}
