import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Reading {
	
	Point[][][] lines = new Point[24][10][9];
	String[][] label = new String[24][10];
	
	File file = new File("Izolinie");
	
	
	String sentence = null;
	String[] splitedsentence = null;
	String[] splitedPunkt = null;
	
	public void read() throws FileNotFoundException {
		
		Scanner in = new Scanner(file);
		
		while (in.hasNextLine()){    
			sentence = in.nextLine();
			
			for(int i=0; i<24; i++){
		            	
		    	if (sentence.equals(Integer.toString(i))){
		            	
		    	splitLines(i, in);	
		            
		        }	
			} 	
		}
	}
	
	void splitLines(int i, Scanner in){
		Scanner sc = in;
		int h = i;
		for(int j=0;j<10;j++){
			
	    	sentence = in.nextLine();
	    		
	    	splitedsentence = sentence.split(";");
	    	
	    	createPoints(h, j);
	    	
	    }
	}
	
	void createPoints(int i, int j){
		for(int k=0; k<9; k++){
			
			splitedPunkt = splitedsentence[k].split(",");
			
			lines[i][j][k] = new Point(Integer.parseInt(splitedPunkt[0]), Integer.parseInt(splitedPunkt[1]));
		}  
	}
	
	public void readLabels() throws FileNotFoundException {
		
		File file = new File("Izolinie");
		Scanner in = new Scanner(file);
		
		String sentence = null;
		String[] splitedsentence = null;
		String[] splitedPunkt = null;
		
		
		while (in.hasNextLine()){    
			sentence = in.nextLine();
			
			for(int i=0; i<24; i++){
		            	
		    	if (sentence.equals(Integer.toString(i))){
		            	
		            for(int j=0;j<10;j++){
		            		
		            	sentence = in.nextLine();
		            		
		            	splitedsentence = sentence.split(";");
		            	//System.out.println(splitedsentence[9]);
		            	label[i][j] = splitedsentence[9];
		       
		            }
		        }	
			} 	
		}	
	}			 
}