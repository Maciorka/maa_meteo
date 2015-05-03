import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

class RadioButtonRysuj extends JRadioButton implements ActionListener {

	private ButtonPanel buttonPanel;
	private ImagePanel ImagePanel;
	
	RadioButtonRysuj(ButtonPanel buttonPanel, ImagePanel ImagePanel, String godzina) {
		
		super(godzina);
		
		this.buttonPanel = buttonPanel;
		this.ImagePanel = ImagePanel;
		addActionListener(this);
		this.ImagePanel = ImagePanel;
	}

	public void actionPerformed(ActionEvent e) {
		
		
			ImagePanel.drawLines = this.isSelected();
			ImagePanel.repaint();
		
	}
}
