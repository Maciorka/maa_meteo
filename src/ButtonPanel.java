import java.awt.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{

	public static final int HEIGHT = 100;
	public static final int WIDTH = 100;
	public ImagePanel imagePanel;

	public ButtonPanel(ImagePanel imagePanel){
	
		setLayout(new FlowLayout());
		setLocation(0,0);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		this.imagePanel = imagePanel;
		
		JComboBox list = new JComboBox();
		list.addItem("0:00");
		list.addItem("1:00");
		list.addItem("2:00");
		list.addItem("3:00");
		list.addItem("4:00");
		list.addItem("5:00");
		list.addItem("6:00");
		list.addItem("7:00");
		list.addItem("8:00");
		list.addItem("9:00");
		list.addItem("10:00");
		list.addItem("11:00");
		list.addItem("12:00");
		list.addItem("13:00");
		list.addItem("14:00");
		list.addItem("15:00");
		list.addItem("16:00");
		list.addItem("17:00");
		list.addItem("18:00");
		list.addItem("19:00");
		list.addItem("20:00");
		list.addItem("21:00");
		list.addItem("22:00");
		list.addItem("23:00");
		add(list);
		
		DrawButton WB = new DrawButton(imagePanel, list);
		add(WB);
		
	}
		
}