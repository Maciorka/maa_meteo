import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;


public class DrawButton extends JButton implements ActionListener{

		ImagePanel imagePanel;
		JComboBox list;
	
		DrawButton(ImagePanel imagePanel, JComboBox list) {
			super("Rysuj");
		
			this.imagePanel = imagePanel;
			this.list = list;
			addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) {
			
			imagePanel.drawLines = true;
			
			String help = (String)list.getSelectedItem();
			String[] splitedHelp;
			splitedHelp = help.split(":");
			imagePanel.time = Integer.parseInt(splitedHelp[0]);
			
			imagePanel.repaint();
		}
}
