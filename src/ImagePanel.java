import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ImagePanel extends JPanel {

	protected BufferedImage diskImage;
	private BufferedImage netImage;
	public int panelWidth;
	public int panelHeight;
	
	public Graphics2D g2d;
	
	public Reading read = new Reading();
	
	public static boolean drawLines = false;
	
	public int time;
	
	public ImagePanel() {
		super();
		
		try {
			File imageFile = new File("Mapa.jpg");
			diskImage = ImageIO.read(imageFile);

		} catch (IOException e) {
			System.err.println("reading image error");
			e.printStackTrace();
		}

		panelWidth = diskImage.getWidth();
		panelHeight = diskImage.getHeight();
		Dimension dimension = new Dimension(panelWidth, panelHeight);
		setPreferredSize(dimension);
		
	}

	@Override
	public void paintComponent(Graphics g) {
		
		g2d = (Graphics2D) g;
		
		//narysowanie obrazu z dysku
		g2d.drawImage(diskImage, 0, 0, this);
		
		
		if(drawLines){
			
			try {
    			read.read();
    			read.readLabels();
    		} catch (FileNotFoundException e) {
    		    throw new RuntimeException(e);
    		}
			
            drawLines(g2d);
         
		}
	}

	protected void drawLines(Graphics2D g2d) {
	
        for(int i=0; i<24; i++)
        {	
        	if(i==time)
        	{
        		for(int j = 0; j< read.lines[i].length; j++)
        		{
        			draw(i, j);
        		}
        	}	
        }
	} 
	void draw(int i, int j){
		
		for(int k = 0; k< read.lines[i][j].length - 1 ; k++)
		{
			int x_1;
	        int y_1;
	        
	        int x_2;
	        int y_2;
			
			x_1 = read.lines[i][j][k].x;
			y_1 = read.lines[i][j][k].y;
     
			x_2 = read.lines[i][j][k+1].x;
			y_2 = read.lines[i][j][k+1].y;
			//System.out.println( x_1 + "," + y_1 + " -> " + x_2 +","+y_2);
		
			g2d.drawLine(x_1, y_1, x_2, y_2);
			g2d.drawString(read.label[i][j], read.lines[i][j][read.lines[i][j].length/2].x, read.lines[i][j][read.lines[i][j].length/2].y);

		}	
	}
}
