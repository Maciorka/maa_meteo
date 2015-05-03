import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

class Button extends JButton implements ActionListener {

	private JPanel buttonPanel;
	private ImagePanel ImagePanel;
	private Color[] colors = { Color.GREEN, Color.BLUE, Color.RED };

	Button(JPanel buttonPanel, ImagePanel ImagePanel) {
		super("Rysuj linie");
		this.buttonPanel = buttonPanel;
		this.ImagePanel = ImagePanel;
		setBounds(0, 0, 110, 20);
		// setPreferredSize(new Dimension(110, 20));
		addActionListener(this);
		this.ImagePanel = ImagePanel;
	}

	public void actionPerformed(ActionEvent e) {

		ImagePanel.drawLines = true;
		ImagePanel.repaint();
	}
}
